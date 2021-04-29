package youtubeOverridingTraining;

public class OgrenciKrediManager extends BaseKrediManager{

	//hesapla metodunu burada aynı isim/imza ile override edeceğimizi belirttik
	public double hesapla(double tutar) {
		return tutar*1.10;//normalde 1.18 olan çarpanı burada 1.10 yaparak bu metodu override ettik 
	}
}
