package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.StaffUser;

public interface StaffUserDao extends JpaRepository<StaffUser,Integer>{

}
