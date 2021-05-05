package Entities;

import Abstract.IEntity;

public class Game implements IEntity{

	private int gameId;
	private String gameName;
	private String description;
	private double sellingPrice;
	
	public Game(int gameId,String gameName,String description,double sellingPrice) {
		this.gameId=gameId;
		this.gameName=gameName;
		this.description=description;
		this.sellingPrice=sellingPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public String getDescription() {
		return description;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
}
