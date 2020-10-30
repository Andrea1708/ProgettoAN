package OProject.ANSpringBootApp.Exception;

import java.util.Calendar;

import org.springframework.http.HttpStatus;

public class ExceptionManager {
	
	private Calendar date;
	private HttpStatus httpStatus;
	private String exception;
	private String message;
	
	/**
	 * ExceptionError Constructor
	 * @param date time of the request
	 * @param httpStatus show the request's status
	 * @param exception exception generate
	 * @param message exception's message
	 */
	public ExceptionManager(Calendar date, HttpStatus httpStatus, String exception, String message) {
		super();
		this.date = date;
		this.httpStatus = httpStatus;
		this.exception = exception;
		this.message = message;
	}
	

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Calendar getDate() {
		return date;
	}


	public void setC(Calendar date) {
		this.date = date;
	}


	public String getException() {
		return exception;
	}


	public void setException(String exception) {
		this.exception = exception;
	}



	
	
}


