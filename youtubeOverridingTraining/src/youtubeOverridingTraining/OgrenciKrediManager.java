package youtubeOverridingTraining;

public class OgrenciKrediManager extends BaseKrediManager{

	//hesapla metodunu burada ayn� isim/imza ile override edece�imizi belirttik
	public double hesapla(double tutar) {
		return tutar*1.10;//normalde 1.18 olan �arpan� burada 1.10 yaparak bu metodu override ettik 
	}
}
