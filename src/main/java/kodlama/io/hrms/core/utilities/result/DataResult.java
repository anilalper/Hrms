package kodlama.io.hrms.core.utilities.result;

public class DataResult<T> extends Result {

	private T data;
	

	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
	}

	public T getData() {
		return data;
	}
}
