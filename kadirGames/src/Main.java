import java.sql.Date;
import java.util.GregorianCalendar;

import Abstract.BaseUserManager;
import Abstract.ICampaignService;
import Abstract.ICategoryService;
import Abstract.IGameService;
import Abstract.IOrderService;
import Abstract.IPlayerCheckService;
import Adaptors.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CategoryManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Category;
import Entities.Game;
import Entities.Order;
import Entities.Player;


public class Main {

	public static void main(String[] args) {
	
		// Categories
		CategoryManager categoryService = new CategoryManager();
		Category survival = new Category(1, "Survival");
		Category fps = new Category(2, "FPS");
		Category mmorpg = new Category(3, "MMORPG");
		categoryService.addBulk(new Category[] {survival, fps, mmorpg});
		System.out.println("");
		
		// Games
		GameManager gameService = new GameManager();
		Game game1 = new Game(1, "Counter-Strike: Global Offensive", "Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago.",0);
		Game game2 = new Game(2, "Assassin's Creed : Brotherhood", "Live and breathe as Ezio, a legendary Master Assassin, in his enduring struggle against the powerful Templar Order. He must journey into Italy’s greatest city, Rome, center of power, greed and corruption to strike at the heart of the enemy.",52.99);
		gameService.addBulk(new Game[] {game1, game2});	
		System.out.println("");
		
		// Players + IdentityNumberValidation
		BaseUserManager baseUserManager = new PlayerManager(new MernisServiceAdapter());
		Player player1 = new Player(1, "KadricanEscobar", "Kadir Þükrü", "Gök",  new GregorianCalendar(1993,11,16).getTime(),"43349076398","Assassin's Creed");
		Player player2 = new Player(2, "1001GeceMasalý", "Ali", "Gök",new GregorianCalendar(1995,1,1).getTime(), "10000000", "Forza Horizon 4");
		baseUserManager.addBulk(new Player[] {player1, player2});
		System.out.println("");
		
		// Campaign
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "CSGOX05", game1, "summer campaign", "", 50, new GregorianCalendar(2021,4,1).getTime(), new GregorianCalendar(2021,5,1).getTime()) ;
		campaignManager.add(campaign1);
		System.out.println("");

		// Order
		OrderManager orderManager = new OrderManager();
		Order order1 = new Order(1, new Date(0), (Player)player1 , game1, campaign1);
		orderManager.add(order1);
		System.out.println("");

	}

}
