package OProject.ANSpringBootApp.Exception;

public class ExceptionManager {
	private String message;
	
	/**
	 * Costruttore di ExceptionError con parametri
	 * capire se basta message o servono altri attributi!!!!!!!!!!!!
	 */
	public ExceptionManager() {
		message = "No message";
				
	}
	public ExceptionManager( String message) {
		super();
		this.message = message;
	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


}
