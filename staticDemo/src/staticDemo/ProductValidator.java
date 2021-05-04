package staticDemo;

public class ProductValidator {
	static {System.out.println("yapýcý çalýþtý");}

	public static boolean isValid(Product product) {
		//çok yerde kullanýcaz ve validator'ý newlememek için gerekli 
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {return false;
	}
}
}
