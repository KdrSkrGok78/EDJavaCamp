package staticDemo;

public class ProductValidator {
	static {System.out.println("yap�c� �al��t�");}

	public static boolean isValid(Product product) {
		//�ok yerde kullan�caz ve validator'� newlememek i�in gerekli 
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {return false;
	}
}
}
