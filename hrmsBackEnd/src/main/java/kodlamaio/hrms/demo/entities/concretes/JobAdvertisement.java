package kodlamaio.hrms.demo.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper= false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisement")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne()
	@JoinColumn(name="employer_id")
    private Employer employer;
	@ManyToOne()
	@JoinColumn(name="job_title_id")
    private JobTitle jobTitle;
	@ManyToOne()
	@JoinColumn(name="city_id")
    private City city;
	@Column(name = "last_date")
	private LocalDate lastDate;
	@Column(name = "position_number")
	private int positionNumber;
	@Column(name = "salary")
	private int salary;
	@Column(name = "is_active")
	private boolean isActive;
	
}
