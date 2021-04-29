package youtubePolimorfizimTraining;

public class CustomerManager {

	private BaseLogger logger;//tek bir logger'a ba��ml�l��� azalt�r
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("eklendi");
		this.logger.log("log mesaj�");
	}
}
