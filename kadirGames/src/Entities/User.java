package Entities;

import Abstract.IEntity;

public class User implements IEntity{

	private int id;
	private String userName;
	private String userCode;
	
	public User(int id,String userName) {
		this.id=id;
		this.userName=userName;
	}

	public int getId() {
		return id;
	}

	public String getUserCode() {
		return "#"+getUserName()+getId();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
