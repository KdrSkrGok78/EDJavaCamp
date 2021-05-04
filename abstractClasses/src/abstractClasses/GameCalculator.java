package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(); // hesaplayý override etmek zorundasýn
	
	public final void gameOver() {//final diyerek bunu override etmeyi engelledik çünkü herkese ayný olmalý bu 
		System.out.println("Oyun bitti hacý");
	}
}
