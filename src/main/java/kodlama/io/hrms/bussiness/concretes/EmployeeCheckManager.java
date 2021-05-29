package kodlama.io.hrms.bussiness.concretes;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.models.EmployeeDto;
import kodlama.io.hrms.core.utilities.result.ErrorResult;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessResult;
import kodlama.io.hrms.dataacess.EmployeeDao;
@Service
public class EmployeeCheckManager extends UserCheckManager<EmployeeDto> {

	@Autowired
	private EmployeeDao dao;

	@Override
	public List<Result> check(EmployeeDto user) throws Exception {
		List<Result> results = super.check(user);

		Collections.addAll(results, isBlankOrEmpty(user.getFirstName()), isBlankOrEmpty(user.getLastName()),
				checkManagerConfirm(user.getEmail()));
		return results;
	}

	private Result checkManagerConfirm(String email) {
		if (this.dao.existsByEmail(email)) {
			if (this.dao.getManagerConfirmByEmail(email))
				return new SuccessResult();
		}

		return new ErrorResult("Onaylanmamış Hesap");
	}
}
