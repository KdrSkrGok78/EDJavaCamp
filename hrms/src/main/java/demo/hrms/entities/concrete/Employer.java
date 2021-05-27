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
@Table(name="employers")//hangi dbye karşılık geliyor ? 
@AllArgsConstructor
@NoArgsConstructor
public class Employer {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id'nin nasıl yapılacağını ayarladık
	@Column(name="user_id")
	private int userId;
	@Column(name="web_adress")
	private String webAdress;
	@Column(name="company_name")
	private String companyName;
}
