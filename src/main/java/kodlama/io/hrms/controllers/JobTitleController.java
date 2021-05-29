package kodlama.io.hrms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.bussiness.abstracts.JobTitleService;
import kodlama.io.hrms.core.models.JobTitleDto;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessDataResult;

@RequestMapping("/jobtitle")
@RestController
public class JobTitleController {
	@Autowired
	private JobTitleService jobTitleService;

	@GetMapping("/getall")
	public Result getall() {

		return  this.jobTitleService.getAll();
	}
}
