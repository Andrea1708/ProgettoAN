package OProject.ANSpringBootApp.Exception;

import java.io.IOException;

public class NoCountry extends IOException {

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
