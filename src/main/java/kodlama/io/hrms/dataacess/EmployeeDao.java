package kodlama.io.hrms.dataacess;

import kodlama.io.hrms.entities.concretes.Employee;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployeeDao extends UserDao<Employee>{

	Boolean getManagerConfirmByEmail(String email);
}
