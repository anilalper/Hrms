package kodlama.io.hrms.bussiness.abstracts;

import java.util.List;

import kodlama.io.hrms.core.models.UserDto;
import kodlama.io.hrms.core.utilities.result.Result;

public interface UserCheckService<T> {
	public List<Result> check(T user) throws Exception;
}
