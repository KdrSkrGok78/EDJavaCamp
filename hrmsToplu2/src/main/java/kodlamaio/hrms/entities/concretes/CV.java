package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cvs")
public class CV {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "github_adress")
	private String githubAdress;
	@Column(name = "linkedin_Adress")
	private String linkedinAdress;
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateExperienceInfo> candidateExperienceInfos;
	@OneToMany(mappedBy = "cv")
	private List<ProgrammeLangueage> programmeLangueages;
	@OneToMany(mappedBy = "cv")
	private List<CandidateSchoolInfo> candidateSchoolInfos;
	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguages;
	
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	 private JobSeeker jobSeeker;
	
}
