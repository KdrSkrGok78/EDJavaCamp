package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.ExperienceInfo;

public interface ExperienceInfoDao extends JpaRepository<ExperienceInfo,Integer>{

}
