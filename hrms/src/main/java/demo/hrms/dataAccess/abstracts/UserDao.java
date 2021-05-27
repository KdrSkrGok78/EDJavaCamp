package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
