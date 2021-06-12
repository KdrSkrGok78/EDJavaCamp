package kodlamaio.hrms.demo.business.abstracts;

import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.ActivationCode;

public interface ActivationCodeService {

	Result create(ActivationCode activationCode);
}
