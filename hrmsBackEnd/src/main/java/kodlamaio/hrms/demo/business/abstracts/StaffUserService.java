package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.StaffUser;

public interface StaffUserService {

	DataResult<List<StaffUser>> getAll();
	Result add(StaffUser staffUser);
}
