package kodlamaio.hrms.demo.core.utilities;

public class SuccessResult extends Result{
//sonuç true ise bunu yapıcaz
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}
