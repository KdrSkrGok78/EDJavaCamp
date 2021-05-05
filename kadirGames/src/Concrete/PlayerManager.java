package Concrete;

import Abstract.BaseUserManager;
import Abstract.IPlayerCheckService;
import Entities.User;

public class PlayerManager extends BaseUserManager{

	IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService=playerCheckService;
	}
	@Override
	public void add(User user) {
		
		super.add(user);
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
