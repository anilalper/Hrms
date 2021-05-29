package kodlama.io.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.bussiness.abstracts.UserCheckService;
import kodlama.io.hrms.core.models.UserDto;
import kodlama.io.hrms.core.utilities.helpers.RegexHelper;
import kodlama.io.hrms.core.utilities.helpers.ValidationHelper;
import kodlama.io.hrms.core.utilities.result.ErrorResult;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessResult;
import kodlama.io.hrms.dataacess.UserDao;
import kodlama.io.hrms.entities.concretes.User;

@Service
public  abstract class UserCheckManager<T extends UserDto> implements UserCheckService<T>{

	@Autowired
	private UserDao<User> userDao;
	
	@Override
	public List<Result> check(T user) throws Exception {
		return ValidationHelper.Checker(checkEmailBlank(user.getEmail()),
				checkEmailDuplicate(user.getEmail()),
				checkPasswordBlank(user.getPassword()));
	}
	
	private Result checkEmailDuplicate(String email) {
		if (this.userDao.existsByEmail(email)) {
			return new ErrorResult("Email Already Exists");
		}
		return new SuccessResult();
	}
	private Result checkEmailBlank(String email) {
		if (email.isBlank()||email.isEmpty()) {
			return new ErrorResult("Email cannot be blank");
		}
		return new SuccessResult();
	}
	private Result checkPasswordBlank(String password) {
		if (password.isBlank()||password.isEmpty()) {
			return new ErrorResult("Password cannot be blank");
		}
		return new SuccessResult();
	}
	protected Result isBlankOrEmpty(String input) {

		if (input.isBlank() || input.isEmpty()) {
			return new ErrorResult("Girilen Alan Boş Olamaz");
		}
		return new SuccessResult();
	}
}
