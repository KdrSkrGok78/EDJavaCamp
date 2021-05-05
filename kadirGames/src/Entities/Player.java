package Entities;

import java.util.Date;

public class Player extends User{

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String identityNumber;
	private String ownedGame;
	
	public Player(int id, String userName,String firstName,String lastName,
		Date dateOfBirth,String identityNumber,String ownedGame) 
	{
		super(id, userName);
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.identityNumber=identityNumber;
		this.ownedGame=ownedGame;
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

	public String getIdentityNumber() {
		return identityNumber;
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

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getOwnedGame() {
		return ownedGame;
	}

	public void setOwnedGame(String ownedGame) {
		this.ownedGame = ownedGame;
	}

}
