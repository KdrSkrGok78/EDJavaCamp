package kadirBuradaMarket.dataAccess.abstracts;

import kadirBuradaMarket.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void login(User user);
}
