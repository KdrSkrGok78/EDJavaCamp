package Concrete;

import java.util.Date;

import Abstract.IOrderService;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class OrderManager implements IOrderService{


	
	@Override
	public void add(Order order) {

		Game game = order.getGame();
		Player player = order.getPlayer();
		Campaign campaign = order.getCampaign();
		
		double discountedPrice = this.campaignImplementOperation(order);
		
		System.out.println("|orderId|productName|sellingPrice|playerName|campaignCode|discountedPrice|");
		System.out.println("|---|---|---|---|---|---|");
		System.out.println("|" + order.getId()
				+ "|" + game.getGameName()
				+ "|" + game.getSellingPrice()
				+ "|" + player.getFirstName() + " " + player.getLastName()
				+ "|" + campaign.getCampaignCode()
				+ "|" + discountedPrice
				);
	}

	private double campaignImplementOperation(Order order) {
		Date now = new Date();
		Campaign campaign = order.getCampaign();
		Game product = order.getGame();
		double discountedPrice;
		
		if(campaign != null) {
			if(now.after(campaign.getStartDate()) && now.before(campaign.getEndDate())) {
				System.out.println("Kampanya iþlendi : " + campaign.getCampaignCode());
				discountedPrice = (product.getSellingPrice() - (product.getSellingPrice() * campaign.getDiscountPercent() / 100));
				System.out.println("Ýndirimli Fiyat : " + discountedPrice);
				return discountedPrice;
				
			}else {
				System.out.println("Ýndirim bitti.");
				return product.getSellingPrice();
			}
		}
		return product.getSellingPrice();
			
	}

	@Override
	public void addBulk(Order[] orders) {
		for (Order order : orders) {
			this.add(order);
		}
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariþ : " + order.getId() + " güncellendi. ");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariþ : " + order.getId() + " silindi. ");	
		
	}

	
}
