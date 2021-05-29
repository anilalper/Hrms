package kodlama.io.hrms.bussiness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.bussiness.abstracts.EmployeeService;
import kodlama.io.hrms.core.models.EmployeeDto;
import kodlama.io.hrms.dataacess.UserDao;
import kodlama.io.hrms.entities.concretes.Employee;
import kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployeeManager implements EmployeeService {

	@Autowired
	private UserDao<Employee> EmployeeDao;
	
	public  EmployeeManager(UserDao<Employee> employeeDao) {
		// TODO Auto-generated constructor stub
		this.EmployeeDao=employeeDao;
	}
	@Override
	public List<EmployeeDto> getAll() {
		// TODO Auto-generated method stub
		List<EmployeeDto> dto=new ArrayList<EmployeeDto>();
		for (Employee employee :  this.EmployeeDao.findAll()) {
			dto.add(new EmployeeDto(employee.getEmail(), employee.getPassword(), employee.getFirstName(), employee.getLastName()));
		}
		
		return dto;
	}

}
