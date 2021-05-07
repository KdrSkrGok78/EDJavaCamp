package kadirBuradaMarket.dataAccess.concretes;

import kadirBuradaMarket.dataAccess.abstracts.UserDao;
import kadirBuradaMarket.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Kaydýnýz tamamlandý iyi alýþ-veriþler Sn."+user.getLastName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Tekrar hoþ geldiniz Sn."+user.getLastName());
		
	}

}
