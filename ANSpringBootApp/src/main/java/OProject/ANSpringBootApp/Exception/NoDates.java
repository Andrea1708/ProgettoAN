package OProject.ANSpringBootApp.Exception;

import java.io.IOException;

public class NoDates extends IOException {
	
	private static final long serialVesionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Nessuna data corrisponde a questo filtro!";
	}
}
