package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.ActivationCodeService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.core.utilities.SuccessDataResult;
import demo.hrms.core.utilities.SuccessResult;
import demo.hrms.dataAccess.abstracts.ActivationCodeDao;
import demo.hrms.entities.concrete.ActivationCode;

@Service
public class ActivationCodeManager implements ActivationCodeService{

	private ActivationCodeDao activationCodeDao;
	
	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		super();
		this.activationCodeDao = activationCodeDao;
	}
	
	@Override
	public DataResult<List<ActivationCode>> getAll() {
		return new SuccessDataResult<List<ActivationCode>>(this.activationCodeDao.findAll());
	}

	@Override
	public Result add(ActivationCode activationCode) {
		this.activationCodeDao.save(activationCode);
		return new SuccessResult("kod eklendi");
	}

	

}
