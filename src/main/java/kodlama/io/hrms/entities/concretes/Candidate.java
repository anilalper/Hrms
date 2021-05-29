package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Candidates")
@Getter
@Setter
public class Candidate extends User {

	private String name;

	private String lastName;
	@Column(unique = true, length = 11)
	private Long identityNumber;

	private LocalDate birtOfDate;
}
