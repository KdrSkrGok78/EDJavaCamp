package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bir projede entities hariç bir þey newliyorsan ileride ggsin
		//spring IoC ile iyileþtirilecek
		ProductService productService =new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		
		Product product1 = new Product(1,2,"Elma",12,50);
		productService.add(product1);
	}

}
