
public class Main {

	public static void main(String[] args) 
	{
		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);
		
		
		double dolarDun = 8.1y; //�art bloklar� i�in al��t�rma yapabilirsin x ve y'yi de�i�tirerek
		double dolarBug�n = 8.1x;
		
		
		
		if(dolarBug�n<dolarDun) //istenen �art� yaz
		{
			System.out.println("dolar d��t� resmini g�ster");
		}
		else if(dolarBug�n == dolarDun) //e�er �art olmazsa alternatifleri yaz bundan fazlaca yaz�labilir
		{
			System.out.println("dolar e�ittir resmini g�ster");
		}
		else //e�er alternatif kalmad�ysa olacak olan� yaz
		{
			System.out.println("dolar ��kt� resmini g�ster");
		}
		
		String[] krediler = {
				"h�zl� kredi",
				"mutlu emekli kredisi",
				"konut kredisi",
				"�ift�i kredisi",
				"meb kredisi",
				"msb kredisi"
		};
		
	
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		System.out.println(sayi1); // de�er tiptir bir de�i�iklik yapt�k ve �ncekini sildi sonucu 20 ald�k
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1=sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); // referans tiptir bir de�i�iklik yapt�k referans� de�i�ti sonucu 100 ald�k
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1=sehir2;
		sehir2= "�zmir";
		System.out.println(sehir1); // string ref tip de olsa de�er tip mant���nda �al���r bu y�zden sonucu istanbul ald�k
	};

}
