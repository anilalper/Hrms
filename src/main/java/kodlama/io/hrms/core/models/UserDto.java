package kodlama.io.hrms.core.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserDto {
	private String email;

	private String password;

	public UserDto() {
	}

	public UserDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
}
