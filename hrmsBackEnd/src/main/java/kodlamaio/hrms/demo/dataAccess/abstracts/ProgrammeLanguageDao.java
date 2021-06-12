package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.ProgrammeLanguage;

public interface ProgrammeLanguageDao extends JpaRepository<ProgrammeLanguage,Integer>{

}
