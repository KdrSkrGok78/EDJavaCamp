package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	LoggerService loggerService;
	ProductDao productDao;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}


	@Override
	public void add(Product product) {//dataAccesste ürün veritabanýna eklenir burada ise ekleme kuralýmýz yazýlý fark budur
		
		if(product.getCategoryId()== 1) {
			System.out.println("bu kategoride ürün kabul edilmiyor");
			return;
		}
		else {
			this.productDao.add(product);//baðýmlýlýk 0
			this.loggerService.logToSystem("ürün eklendi : "+product.getName());
		}
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
//iþ kodlarýný yapacak sýnýfýmýz
	
	
	
}
