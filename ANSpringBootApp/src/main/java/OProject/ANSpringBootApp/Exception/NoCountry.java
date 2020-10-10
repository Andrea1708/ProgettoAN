package OProject.ANSpringBootApp.Exception;

public class NoCountry extends ExceptionManager {

		private static final long serialVersionUID = 1L; /** vedere bene cosa serve la serial vesion*/

		/**
		 * Ottiene il messaggio da stampare.
		 *
		 * @return String
		 */
		@Override
		public String getMessage() {
			return "Nessun Paese rispetta questi filtri!";
		}

	}
