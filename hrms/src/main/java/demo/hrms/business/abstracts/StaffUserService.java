package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.StaffUser;

public interface StaffUserService {

	DataResult<List<StaffUser>> getAll();
	Result add(StaffUser staffUser);
}
