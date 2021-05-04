package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();//kadýna göre hesapladý
		womanGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();//erkeklere göre hesapladý
		
	}

}
