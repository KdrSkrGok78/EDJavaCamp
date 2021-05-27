package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.ActivationCode;


public interface ActivationCodeDao extends JpaRepository<ActivationCode,Integer>{

}
