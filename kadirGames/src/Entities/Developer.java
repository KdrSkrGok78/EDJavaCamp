package Entities;

public class Developer extends User{

	private String developingGame;
	private String biografy;
	
	public Developer(int id, String userCode, String userName,String developingGame,String biografy) {
		super(id, userName);
	
		this.developingGame=developingGame;
		this.biografy=biografy;
	}

	public String getDevelopingGame() {
		return developingGame;
	}

	public void setDevelopingGame(String developingGame) {
		this.developingGame = developingGame;
	}

	public String getBiografy() {
		return biografy;
	}

	public void setBiografy(String biografy) {
		this.biografy = biografy;
	}

}
