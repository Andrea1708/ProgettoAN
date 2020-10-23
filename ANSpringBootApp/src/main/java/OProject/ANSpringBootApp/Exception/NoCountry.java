package OProject.ANSpringBootApp.Exception;

import java.io.IOException;

public class NoCountry extends IOException {

		private static final long serialVersionUID = 1L; /** vedere bene cosa serve la serial vesion*/

		/**
		 * get the exception message.
		 *
		 * @return String
		 */
		@Override
		public String getMessage() {
			return "Questo Paese non fa parte della nostra lista!";
		}

	}
