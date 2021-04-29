package youtubePolimorfizimTraining;

public class CustomerManager {

	private BaseLogger logger;//tek bir logger'a baðýmlýlýðý azaltýr
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("eklendi");
		this.logger.log("log mesajý");
	}
}
