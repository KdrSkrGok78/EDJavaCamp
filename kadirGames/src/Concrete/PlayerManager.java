package Concrete;

import Abstract.BaseUserManager;
import Abstract.IPlayerCheckService;
import Entities.Player;
import Entities.User;

public class PlayerManager extends BaseUserManager{

	IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService=playerCheckService;
	}
	public void addPlayer(Player player) throws Exception {//mecbur kaldým çünkü parametrenin deðiþmesi gerekiyordu
		
		if(playerCheckService.checkIfRealUser(player)) {
			super.add(player);
		}
		else {throw new Exception("not a valid person");}
	}
	@Override
	public void delete(User user) {
		
		super.delete(user);
	}
	@Override
	public void addBulk(User[] users) {
		
		super.addBulk(users);
	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
	}
	
}
