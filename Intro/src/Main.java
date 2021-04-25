
public class Main {

	public static void main(String[] args) 
	{
		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		
		
		double dolarDun = 8.1y; //þart bloklarý için alýþtýrma yapabilirsin x ve y'yi deðiþtirerek
		double dolarBugün = 8.1x;
		
		
		
		if(dolarBugün<dolarDun) //istenen þartý yaz
		{
			System.out.println("dolar düþtü resmini göster");
		}
		else if(dolarBugün == dolarDun) //eðer þart olmazsa alternatifleri yaz bundan fazlaca yazýlabilir
		{
			System.out.println("dolar eþittir resmini göster");
		}
		else //eðer alternatif kalmadýysa olacak olaný yaz
		{
			System.out.println("dolar çýktý resmini göster");
		}
		
		String[] krediler = {
				"hýzlý kredi",
				"mutlu emekli kredisi",
				"konut kredisi",
				"çiftçi kredisi",
				"meb kredisi",
				"msb kredisi"
		};
		
	
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		System.out.println(sayi1); // deðer tiptir bir deðiþiklik yaptýk ve öncekini sildi sonucu 20 aldýk
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1=sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); // referans tiptir bir deðiþiklik yaptýk referansý deðiþti sonucu 100 aldýk
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1=sehir2;
		sehir2= "Ýzmir";
		System.out.println(sehir1); // string ref tip de olsa deðer tip mantýðýnda çalýþýr bu yüzden sonucu istanbul aldýk
	};

}
