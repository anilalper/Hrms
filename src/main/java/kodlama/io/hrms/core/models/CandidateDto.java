package kodlama.io.hrms.core.models;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CandidateDto extends UserDto{
	private String name;

	private String lastName;
	private long identityNumber;

	private LocalDate birtOfDate;
}

