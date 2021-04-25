package oopIntro;

public class Main {

	public static void main(String[] args) 
	{
		
		
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram"); //Referans oluşturma, instance
		
		
		Product product2 = new Product();
		product2.id=2;
		product2.detail="12 gb ram";
		product2.name="hp v15";
		product2.unitPrice = 16000;
		
		Product product3 = new Product();
		product3.id=3;
		product3.detail="16 gb ram";
		product3.name="asus v15";
		product3.unitPrice = 12000;
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);//ben çalıştım 2 kere yazar çünkü newleyip altına tanım yaptık bu yüzden ben çalıştım kodu içeren ctor bloğu çalışır 
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products)
		{
			System.out.println(product.name);//böylece product'ların name'leri dönecektir detail yazsaydık detayları dönerdi kısaca neyi yazarsan o döner.
		}
		
		
		
		System.out.println(products.length);
		
	}

}
