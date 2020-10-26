package OProject.ANSpringBootApp.Exception;

import org.springframework.http.HttpStatus;

public class ExceptionManager {
	
	private HttpStatus httpStatus;
	private String exception;
	private String message;
	
	public ExceptionManager(HttpStatus httpStatus, String exception, String message) {
		super();
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

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
