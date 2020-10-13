package OProject.ANSpringBootApp.Exception;

public class NoCountry extends ExceptionManager {

		private static final long serialVersionUID = 1L; 
		@Override
		public String getMessage() {
			return "Nessun Paese rispetta questi filtri!";
		}

	}
