package kodlama.io.hrms.core.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EmployerDto extends UserDto {
	
	private String companyName;

	private String webAdress;

	private String phoneNumber;

	private boolean managerConfirm = false;
}
