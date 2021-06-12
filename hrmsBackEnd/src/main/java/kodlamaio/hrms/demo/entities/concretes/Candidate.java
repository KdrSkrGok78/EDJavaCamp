package kodlamaio.hrms.demo.entities.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrms.demo.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper= false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
public class Candidate{

	@Id
	@Column(name = "user_id")
	private int userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "birth_date")
	private LocalDate birthDate;
	@Column(name = "github_adress")
	private String githubAdress;
	@Column(name = "linkedin_adress")
	private String linkedinAdress;
	@Column(name = "description")
	private String description;
	@Column(name = "tc_no")
	private String tcNo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Cv> cvs;
	
	@OneToOne()
	@MapsId
	@JoinColumn(name="user_id")
	private User user;
}
