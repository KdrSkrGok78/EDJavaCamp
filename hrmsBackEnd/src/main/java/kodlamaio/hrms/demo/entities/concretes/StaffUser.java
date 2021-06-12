package kodlamaio.hrms.demo.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
@Table(name = "staff_users")
public class StaffUser{

	@Id
	@Column(name = "user_id")
	private int userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name="position")
	private String position;
	@Column(name = "tc_no")
	private String tcNo;
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@OneToOne()
	@MapsId
	@JoinColumn(name="user_id")
	private User user;
}
