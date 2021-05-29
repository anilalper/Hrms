package kodlama.io.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Employers")
@Getter
@Setter

public class Employer extends User {
	
	private String companyName;

	private String webAdress;

	private String phoneNumber;

	private boolean managerConfirm = false;
}
