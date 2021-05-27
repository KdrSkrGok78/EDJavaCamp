package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.ActivationCode;

public interface ActivationCodeService {

	DataResult<List<ActivationCode>> getAll();
	Result add(ActivationCode activationCode);
	
}
