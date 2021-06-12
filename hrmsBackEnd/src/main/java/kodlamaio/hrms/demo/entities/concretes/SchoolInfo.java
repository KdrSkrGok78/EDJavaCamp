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
@Table(name = "candidate_school_infos")
public class SchoolInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name = "school_name")
	private String schoolName;
	@Column(name = "department")
	private String department;
	@Column(name = "finish_time")
	private LocalDate finishDate;
	@ManyToOne()
	@JoinColumn(name="user_id")
    private Candidate candidate;
	@ManyToOne()
	@JoinColumn(name="cv_id")
    private Cv cv;
}
