package OProject.ANSpringBootApp.Exception;

public class IncorrectOrder extends Exception_Err {
	
	private static final long serialVersionUID = 1L; 

	/**
	 * get the exception message.
	 *
	 * @return String
	 */
	@Override
	public String getMessage() 
	{
		
		return "Queste date non sono inserite nell'ordine corretto!";
	}

}

