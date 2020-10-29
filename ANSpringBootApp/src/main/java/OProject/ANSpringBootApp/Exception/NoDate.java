package OProject.ANSpringBootApp.Exception;

public class NoDate extends Exception_Err {
	
	private static final long serialVersionUID = 1L; 

	/**
	 * get the exception message.
	 *
	 * @return String
	 */
	@Override
	public String getMessage() 
	{
		
		return "Questa Data non fa parte del nostro ranking di resoconti giornalieri ";
	}

}


