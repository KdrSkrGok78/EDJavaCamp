package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.StaffUser;


public interface StaffUserDao extends JpaRepository<StaffUser,Integer>{

}
