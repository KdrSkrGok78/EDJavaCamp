package demo.hrms.entities.concrete;

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
import lombok.NoArgsConstructor;

@Data//getter setter otamatik oluşur
@Entity//sen lanet bir entitysin
@Table(name="job_advertisement")//hangi dbye karşılık geliyor ? 
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	// getall , sorted , getbycontain , diğerine bakarız
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //id'nin nasıl yapılacağını ayarladık
		@Column(name="id")
		private int id;
		@Column(name="required_number")
		private int requiredNumber;
	    @ManyToOne()
	    @JoinColumn(name="id")
		private JobTitle jobTitle;
	    @ManyToOne()
	    @JoinColumn(name="user_id")
		private Employer employer;
		@Column(name="announcement_time")
		private Date announcementTime;
		@Column(name="last_date")
		private Date lastDate;
		@Column(name="salary")
		private double salary;
		@Column(name="which_city")
		private String whichCity;
		@Column(name="description")
		private String description;
		@Column(name="job_still_open")
		private boolean jobStillOpen;
		
		
		
		
		
}
