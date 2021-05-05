package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " : eklenmiþtir.");
		
	}

	@Override
	public void addBulk(Game[] games) {
		for (Game game : games) {
			this.add(game);
		}
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " : eklenmiþtir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " : eklenmiþtir.");
		
	}

}
