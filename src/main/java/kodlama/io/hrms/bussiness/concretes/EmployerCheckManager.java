package kodlama.io.hrms.bussiness.concretes;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.models.EmployerDto;
import kodlama.io.hrms.core.utilities.result.ErrorResult;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessResult;
@Service
public class EmployerCheckManager extends UserCheckManager<EmployerDto> {

	@Override
	public List<Result> check(EmployerDto user) throws Exception {
		List<Result> results = super.check(user);

		Collections.addAll(results, isBlankOrEmpty(user.getCompanyName()), isBlankOrEmpty(user.getPhoneNumber()),
				isBlankOrEmpty(user.getWebAdress()), checkEmailAndWebAddress(user.getEmail(), user.getWebAdress()));
		return results;
	}

	private Result checkEmailAndWebAddress(String email, String webAdress) {
		String[] emailDomain = email.split(new String("@"));
		String[] WebAdress = webAdress.split(new String("www."));

		if (emailDomain[1] == WebAdress[1]) {
			return new SuccessResult();
		}
		return new ErrorResult("Domain ile Email uzantıları aynı olmalı");

	}
}
