package youtubePolimorfizimTraining;

public class Main {

	public static void main(String[] args) {
		
		EmailLogger logger = new EmailLogger();
		logger.log();// mesajýmýzý (emailmanagerda olaný) yazýyor overriding yaptýk.
		
		FileLogger logger2 = new FileLogger();
		logger2.log("file ile loglandý");//baseloggerda loglama yapýldý mesajýnýn yanýnda string istedik ve burda string ifadeyi yazdýk yani filelogger da 
		//baseloggerýn metodunu çalýþtýrabiliyor databaselogger da email de bunu yapabilir fakat email override ettiðimizi çalýþtýrmaz ctor mantýðý var.

		
		//array veya for döngüsü yazarken baselogger hepsini tutabilir fakat tuttuklarý onu tutamaz.
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()};
		for(BaseLogger logger1 : loggers) {
			logger1.log("log mesajý");
		}//BaseLogger[] yerine diðer loggerlarý yazarsan hata alýrsýn çünkü diðer loggerlar onu tutamaz.
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
