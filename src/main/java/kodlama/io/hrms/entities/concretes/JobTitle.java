package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import kodlama.io.hrms.entities.abstracts.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "job_titles")
public class JobTitle extends BaseEntity<Long>{
	@Column(unique = true)
	private String title;
}