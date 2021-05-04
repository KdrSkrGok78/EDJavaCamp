package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager manager = new ProductManager();
		Product product1= new Product();
		
		product1.price = 10;
		product1.name="mause";
		
		manager.add(product1);
		
		DatabaseHelper.Crud.delete();
		
	}

}
