package kodlama.io.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Employees")
@Getter
@Setter
public class Employee extends User {

    private String firstName;
	
	private String lastName;
}
