package oopIntro;

public class Product 
{
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	} //ctor bloklar�ndan biri kesin �al���r (yazmasan bile �al���yor) ama fazla blok varsa da birisi �al���r
	
	int id;
	String name ;
	double unitPrice ;
	String detail;
	
}
