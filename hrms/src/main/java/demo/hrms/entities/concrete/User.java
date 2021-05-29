package demo.hrms.entities.concrete;

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
@Table(name="users")//hangi dbye karşılık geliyor ? 
@AllArgsConstructor
@NoArgsConstructor
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id'nin nasıl yapılacağını ayarladık
	@Column(name="id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
}