package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();//kad�na g�re hesaplad�
		womanGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();//erkeklere g�re hesaplad�
		
	}

}
