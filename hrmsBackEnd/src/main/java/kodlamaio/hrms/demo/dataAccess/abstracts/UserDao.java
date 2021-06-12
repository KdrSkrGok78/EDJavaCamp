package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.demo.entities.abstracts.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
