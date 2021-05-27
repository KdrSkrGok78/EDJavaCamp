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
@Table(name="activation_codes")//hangi dbye karşılık geliyor ? 
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id'nin nasıl yapılacağını ayarladık
	@Column(name="user_id")
	private int userId;
	@Column(name="activation_code")
	private String activationCode;
	@Column(name="code_situation")
	private boolean codeSituation;
	
	
}
