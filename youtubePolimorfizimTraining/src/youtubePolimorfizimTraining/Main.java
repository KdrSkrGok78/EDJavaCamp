package youtubePolimorfizimTraining;

public class Main {

	public static void main(String[] args) {
		
		EmailLogger logger = new EmailLogger();
		logger.log();// mesaj�m�z� (emailmanagerda olan�) yaz�yor overriding yapt�k.
		
		FileLogger logger2 = new FileLogger();
		logger2.log("file ile logland�");//baseloggerda loglama yap�ld� mesaj�n�n yan�nda string istedik ve burda string ifadeyi yazd�k yani filelogger da 
		//baselogger�n metodunu �al��t�rabiliyor databaselogger da email de bunu yapabilir fakat email override etti�imizi �al��t�rmaz ctor mant��� var.

		
		//array veya for d�ng�s� yazarken baselogger hepsini tutabilir fakat tuttuklar� onu tutamaz.
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()};
		for(BaseLogger logger1 : loggers) {
			logger1.log("log mesaj�");
		}//BaseLogger[] yerine di�er loggerlar� yazarsan hata al�rs�n ��nk� di�er loggerlar onu tutamaz.
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
