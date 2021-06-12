package kodlamaio.hrms.demo.core.utilities;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data,true,message);//bunları değiştirirek alternatifler yapabilirsin
	}
	public SuccessDataResult(T data) {
		super(data,true);
	}
	public SuccessDataResult() {
		super(null,true);
	}
	public SuccessDataResult(String message) {
		super(null,true);
	}

}
