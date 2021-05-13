package hrms.demo.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="job_name")
	private String name;
	
	public JobTitle() {
		
	}
	
	
	public JobTitle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
