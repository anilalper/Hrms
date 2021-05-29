package kodlama.io.hrms.core.utilities.helpers;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.hrms.core.utilities.result.Result;

public class ValidationHelper {

	public static List<Result> Validator(Result... results) {
		List<Result> resultList = new ArrayList<Result>();
		for (Result result : results) {
			if(!result.isSuccess()) {
				resultList.add(result);
			}
		}
		return resultList;
	}
	
	public static List<Result> Checker(Result... results) {
		return Validator(results);
	}
}