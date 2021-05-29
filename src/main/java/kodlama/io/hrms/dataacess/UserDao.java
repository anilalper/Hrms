package kodlama.io.hrms.dataacess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import kodlama.io.hrms.entities.concretes.User;


public interface UserDao<T extends User> extends JpaRepository<T, Integer>{
     
	boolean existsByEmail(String email);
}
