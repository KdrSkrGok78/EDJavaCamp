package kodlamaio.hrms.demo.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper= false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_titles")

public class JobTitle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name = "job_name")
	private String jobName ;
	@JsonIgnore
	@OneToMany(mappedBy = "jobTitle")
	private List<JobAdvertisement> jobAdvertisements;
}
