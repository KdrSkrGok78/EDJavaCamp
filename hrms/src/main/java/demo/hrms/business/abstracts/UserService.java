package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
}
