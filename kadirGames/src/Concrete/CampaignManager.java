package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Oyun : " + campaign.getGame().getGameName() + " , Kampanya kodu : " + campaign.getCampaignCode() + " created.");		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Oyun : " + campaign.getGame().getGameName() + " , Kampanya kodu : " + campaign.getCampaignCode() + " updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Oyun : " + campaign.getGame().getGameName() + " , Kampanya kodu : " + campaign.getCampaignCode() + " deleted.");				
	}

}
