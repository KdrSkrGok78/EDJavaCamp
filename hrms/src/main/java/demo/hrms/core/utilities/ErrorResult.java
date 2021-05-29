package demo.hrms.core.utilities;

public class ErrorResult extends Result{
//sonuç negatifse bunu yap diyoruz
	public ErrorResult() {
		super(false);
		}
	
	
	public ErrorResult(String message) {
		super(false,message);
	}
}
