package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(); // hesaplay� override etmek zorundas�n
	
	public final void gameOver() {//final diyerek bunu override etmeyi engelledik ��nk� herkese ayn� olmal� bu 
		System.out.println("Oyun bitti hac�");
	}
}
