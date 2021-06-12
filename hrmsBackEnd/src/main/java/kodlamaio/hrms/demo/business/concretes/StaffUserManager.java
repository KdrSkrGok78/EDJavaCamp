package kodlamaio.hrms.demo.business.concretes;

import java.util.List;

import kodlamaio.hrms.demo.business.abstracts.StaffUserService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessResult;
import kodlamaio.hrms.demo.dataAccess.abstracts.StaffUserDao;
import kodlamaio.hrms.demo.entities.concretes.StaffUser;

public class StaffUserManager implements StaffUserService{

	private StaffUserDao staffUserDao;
	
	public StaffUserManager(StaffUserDao staffUserDao) {
		super();
		this.staffUserDao = staffUserDao;
	}

	@Override
	public DataResult<List<StaffUser>> getAll() {
		return new SuccessDataResult<List<StaffUser>>(this.staffUserDao.findAll(), "Datalar listelendi.");
	}

	@Override
	public Result add(StaffUser staffUser) {
		this.staffUserDao.save(staffUser);
		return new SuccessResult("Sistem çalışanı eklendi.");
	}

}
