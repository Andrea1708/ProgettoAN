package OProject.ANSpringBootApp.Exception;

public class Notenought extends Exception_Err {
	private static final long serialVersionUID = 1L; 
	/**
	 * get the exception message.
	 *
	 * @return String
	 */
	@Override
	public String getMessage() 
	{
		
		return "Il file da scaricare è troppo grande, cercare un altra lettera";
	}

}
