package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.StaffUserService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.core.utilities.SuccessDataResult;
import demo.hrms.core.utilities.SuccessResult;
import demo.hrms.dataAccess.abstracts.StaffUserDao;
import demo.hrms.entities.concrete.StaffUser;

@Service
public class StaffUserManager implements StaffUserService{

private StaffUserDao staffUserDao;
	
	@Autowired
	public StaffUserManager(StaffUserDao staffUserDao) {
		super();
		this.staffUserDao = staffUserDao;
	}
	
	@Override
	public DataResult<List<StaffUser>> getAll() {
		return new SuccessDataResult<List<StaffUser>>(this.staffUserDao.findAll());
	}

	@Override
	public Result add(StaffUser staffUser) {
		this.staffUserDao.save(staffUser);
		return new SuccessResult("kod eklendi");
	}

}
