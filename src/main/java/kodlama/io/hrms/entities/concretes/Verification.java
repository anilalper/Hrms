package kodlama.io.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import kodlama.io.hrms.entities.abstracts.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "verifications")
@Getter
@Setter
public class Verification extends BaseEntity<Long> {

	private String verificationCode;

	@OneToMany(fetch = FetchType.LAZY)
	private List<User> users;

	public Verification() {
		users = new ArrayList<User>();
	}
}
