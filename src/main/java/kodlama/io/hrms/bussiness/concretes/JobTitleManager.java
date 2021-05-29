package kodlama.io.hrms.bussiness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.bussiness.abstracts.JobTitleService;
import kodlama.io.hrms.core.models.JobTitleDto;
import kodlama.io.hrms.core.utilities.result.DataResult;
import kodlama.io.hrms.core.utilities.result.SuccessDataResult;
import kodlama.io.hrms.dataacess.JobTiteDao;
@Service
public class JobTitleManager implements JobTitleService {

	@Autowired
	private JobTiteDao dao;

	@Override
	public DataResult<List<JobTitleDto>> getAll() {
		
		List<JobTitleDto> dtos=new ArrayList<JobTitleDto>();
        dao.findAll().forEach(x ->{
			dtos.add(new JobTitleDto(x.getId(), x.getTitle()));
		});
		return new SuccessDataResult<List<JobTitleDto>>(dtos, "Liste Getirildi");
	}

}
