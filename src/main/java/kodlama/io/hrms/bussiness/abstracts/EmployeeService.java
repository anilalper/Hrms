package kodlama.io.hrms.bussiness.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.models.EmployeeDto;
import kodlama.io.hrms.entities.concretes.Employee;
import kodlama.io.hrms.entities.concretes.Employer;




public interface EmployeeService {

	List<EmployeeDto> getAll();
}
