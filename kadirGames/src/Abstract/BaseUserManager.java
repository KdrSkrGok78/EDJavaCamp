package Abstract;

import Entities.User;

public abstract class BaseUserManager implements IUserService{

	@Override
	public void add(User user) {
		System.out.println(user.getId() + " : eklenmiþtir.");	
		}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId() + " : silinmiþtir.");	
		
	}@Override
	public void update(User user) {
		System.out.println(user.getId() + " : güncellenmiþtir.");	
		
	}

	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
		
	}
}
