package demo.hrms.core.utilities;

public class DataResult<T> extends Result{

	public DataResult(T data,boolean success, String message) {
		super(success, message);
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data,boolean success) {
		super(success);
		// TODO Auto-generated constructor stub
	}

}
