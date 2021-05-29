package kodlama.io.hrms.core.models;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeDto extends UserDto {

	private String firstName;

	private String lastName;
	
	public EmployeeDto(String email, String password,String firstName,String lastName) {
		super(email, password);
		this.firstName=firstName;
		this.lastName=lastName;
	}

}
