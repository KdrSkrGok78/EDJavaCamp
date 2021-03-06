package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Department;

public interface DepartmentService {
	
	public DataResult<List<Department>> getAll();
	public Result add(Department department);
	public Result delete(Department department);

}