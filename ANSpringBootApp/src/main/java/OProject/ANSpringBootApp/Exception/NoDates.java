package OProject.ANSpringBootApp.Exception;

import java.io.IOException;

public class NoDates extends IOException {
	
	private static final long serialVesionUID = 1L;
	
	// check if the inserted date is valid
	
	@Override
	public String getMessage() {
		return "Nessuna data corrisponde a questo filtro!";
	}
}
