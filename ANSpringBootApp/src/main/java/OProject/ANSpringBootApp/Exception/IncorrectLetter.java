package OProject.ANSpringBootApp.Exception;

public class IncorrectLetter extends Exception_Err {

	private static final long serialVersionUID = 1L; 

	/**
	 * get the exception message.
	 *
	 * @return String
	 */
	@Override
	public String getMessage() 
	{
		
		return " A questa lettera non corrisponde nessun paese della nostra lista!";
	}
}
