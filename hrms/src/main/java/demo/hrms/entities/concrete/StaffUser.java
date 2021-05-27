package demo.hrms.entities.concrete;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter setter otamatik oluşur
@Entity//sen lanet bir entitysin
@Table(name="staff_users")//hangi dbye karşılık geliyor ? 
@AllArgsConstructor
@NoArgsConstructor
public class StaffUser {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id'nin nasıl yapılacağını ayarladık
	@Column(name="user_id")
	private int userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="birth_date")
	private Date birthDate;
	@Column(name="tc_no")
	private String tcNo;
	@Column(name="position")
	private String position;
	@Column(name="email")
	private String email;
}
