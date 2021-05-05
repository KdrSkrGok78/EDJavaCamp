package Abstract;

import Entities.Player;
import Entities.User;

public abstract class BaseUserManager implements IUserService{

	public void addPlayer(Player player) throws Exception {
		
	}
	@Override
	public void add(User user) {
		System.out.println(user.getId() + " : eklenmi�tir.");	
		}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId() + " : silinmi�tir.");	
		
	}@Override
	public void update(User user) {
		System.out.println(user.getId() + " : g�ncellenmi�tir.");	
		
	}

	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
		
	}
}
