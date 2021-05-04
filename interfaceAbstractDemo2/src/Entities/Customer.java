package Entities;

import java.util.Date;

public class Customer {

	public int id;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String nationalId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
}
