package Abstract;

import Entities.Player;
import Entities.User;

public abstract class BaseUserManager implements IUserService{

	public void addPlayer(Player player) throws Exception {
		
	}
	@Override
	public void add(User user) {
		System.out.println(user.getId() + " : eklenmiştir.");	
		}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId() + " : silinmiştir.");	
		
	}@Override
	public void update(User user) {
		System.out.println(user.getId() + " : güncellenmiştir.");	
		
	}

	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
		
	}
}
