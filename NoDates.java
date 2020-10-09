package OProject.ANSpringBootApp.Exception;

public class NoDates extends ExceptionManager {
	
	private static final long serialVesionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Nessuna data corrisponde a questo filtro!";
	}
}
