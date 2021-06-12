package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode,Integer>{

}
