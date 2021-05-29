package demo.hrms.core.utilities;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, String message) {
		super(data,false,message);//bunları değiştirirek alternatifler yapabilirsin
	}
	public ErrorDataResult(T data) {
		super(data,false);
	}
	public ErrorDataResult() {
		super(null,false);
	}
	public ErrorDataResult(String message) {
		super(null,false);
	}
}
