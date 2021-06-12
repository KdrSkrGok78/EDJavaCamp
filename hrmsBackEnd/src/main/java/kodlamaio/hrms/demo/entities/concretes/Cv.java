package kodlamaio.hrms.demo.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cvs")
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	
	
	@ManyToOne()
 	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<ExperienceInfo> experienceInfos;
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguages;
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<ProgrammeLanguage> programmeLanguages;
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<SchoolInfo> schoolInfos;
	
}
