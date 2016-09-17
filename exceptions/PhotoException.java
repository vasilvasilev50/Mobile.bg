package exceptions;

public class PhotoException extends Exception {

	private static final long serialVersionUID = 7476970094670752260L;

	protected PhotoException() {
		super();
	}

	protected PhotoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PhotoException(String arg0) {
		super(arg0);
	}

	protected PhotoException(Throwable arg0) {
		super(arg0);
	}

}
