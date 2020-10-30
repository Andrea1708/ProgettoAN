package OProject.ANSpringBootApp.Exception;

public abstract class Exception_Err extends RuntimeException {

private static final long serialVersionUID = 1L;
	
	/**
	 * get the exception message.
	 *@return String
	 */
	public abstract String getMessage();
}
