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
	public void add(Product product) {//dataAccesste �r�n veritaban�na eklenir burada ise ekleme kural�m�z yaz�l� fark budur
		
		if(product.getCategoryId()== 1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor");
			return;
		}
		else {
			this.productDao.add(product);//ba��ml�l�k 0
			this.loggerService.logToSystem("�r�n eklendi : "+product.getName());
		}
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
//i� kodlar�n� yapacak s�n�f�m�z
	
	
	
}
