package kodlama.io.hrms.dataacess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import kodlama.io.hrms.core.models.JobTitleDto;
import kodlama.io.hrms.entities.concretes.JobTitle;

//@NoRepositoryBean
public interface JobTiteDao extends JpaRepository<JobTitle, Long>{

	
}
