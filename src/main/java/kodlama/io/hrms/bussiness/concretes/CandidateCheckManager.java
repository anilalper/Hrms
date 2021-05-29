package kodlama.io.hrms.bussiness.concretes;

import java.rmi.RemoteException;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.core.models.CandidateDto;
import kodlama.io.hrms.core.utilities.result.ErrorResult;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessResult;
import kodlama.io.hrms.dataacess.CandidateDao;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class CandidateCheckManager extends UserCheckManager<CandidateDto> {

	@Autowired
	private KPSPublicSoapProxy mernisProxy;
	
	@Override
	public List<Result> check(CandidateDto user) throws Exception {
		List<Result> results = super.check(user);

		Collections.addAll(results, 
				isBlankOrEmpty(user.getName()),
				isBlankOrEmpty(user.getLastName()),
				isBlankOrEmpty(user.getBirtOfDate().toString()));

		 results.add(MernisCheck(user));
		return results;

	}

	private Result MernisCheck(CandidateDto dto) throws RemoteException {
		
		boolean res = mernisProxy.TCKimlikNoDogrula(dto.getIdentityNumber(), dto.getName(), dto.getLastName(),
				dto.getBirtOfDate().getYear());

		if (res) {
			return new SuccessResult();
		}

		return new ErrorResult("Kimlik Bilgilierinde Hata");

	}
}
