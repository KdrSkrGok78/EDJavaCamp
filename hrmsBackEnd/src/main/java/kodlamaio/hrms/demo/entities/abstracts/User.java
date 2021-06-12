package kodlamaio.hrms.demo.entities.abstracts;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrms.demo.entities.concretes.ActivationCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	
	@JsonIgnore//swagger da iç içe olan entityleri engeller
	@OneToMany(mappedBy = "user")
	private List<ActivationCode> activationCodes;
}
