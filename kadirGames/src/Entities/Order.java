package Entities;
import java.util.Date;

public class Order {
	private int id;
	private Date date;
	private Player player;
	private Game game;
	private Campaign campaign;
	
	public Order(int id, Date date, Player player, Game game, Campaign campaign) {
		this.id = id;
		this.date = date;
		this.player = player;
		this.game = game;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}