package Abstract;

import Entities.Game;

public interface IGameService {

	void add(Game game);
	void addBulk(Game[] games);
	void update(Game game);
	void delete(Game game);
}
