package kodlama.io.hrms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.bussiness.abstracts.EmployeeService;
import kodlama.io.hrms.core.consts.ResultMessages;
import kodlama.io.hrms.core.models.EmployeeDto;
import kodlama.io.hrms.core.utilities.result.Result;
import kodlama.io.hrms.core.utilities.result.SuccessDataResult;
import kodlama.io.hrms.entities.concretes.Employee;
import kodlama.io.hrms.entities.concretes.Employer;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getall")
	public Result getall() {

		return new SuccessDataResult<List<EmployeeDto>>(this.employeeService.getAll(), ResultMessages.Success);
	}
}
