package oopIntro;

public class Product 
{
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	} //ctor bloklarýndan biri kesin çalýþýr (yazmasan bile çalýþýyor) ama fazla blok varsa da birisi çalýþýr
	
	int id;
	String name ;
	double unitPrice ;
	String detail;
	
}
