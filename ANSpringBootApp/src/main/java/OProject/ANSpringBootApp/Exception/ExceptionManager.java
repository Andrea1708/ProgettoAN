package OProject.ANSpringBootApp.Exception;

public class ExceptionManager {
	private String message;
	private String nome;
	private String surname;
	
	
	/**
	 * Costruttore di ExceptionError con parametri
	 * capire se basta message o servono altri attributi!!!!!!!!!!!!
	 */
	public ExceptionManager() {
		message = "No message";
		nome = "no nome";
		surname = "no surname";
	}

	public String getNome() {
		return nome;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
