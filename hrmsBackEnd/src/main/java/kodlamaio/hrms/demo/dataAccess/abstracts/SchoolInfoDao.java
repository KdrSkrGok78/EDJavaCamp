package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.SchoolInfo;

public interface SchoolInfoDao extends JpaRepository<SchoolInfo,Integer>{

}
