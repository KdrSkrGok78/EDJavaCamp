package Concrete;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean checkIfRealUser(Player player) {
		return true;
	}


}
