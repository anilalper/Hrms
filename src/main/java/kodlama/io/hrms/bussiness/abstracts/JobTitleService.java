package kodlama.io.hrms.bussiness.abstracts;

import java.util.List;

import kodlama.io.hrms.core.models.JobTitleDto;
import kodlama.io.hrms.core.utilities.result.DataResult;

public interface JobTitleService {

	DataResult<List<JobTitleDto>> getAll();
}
