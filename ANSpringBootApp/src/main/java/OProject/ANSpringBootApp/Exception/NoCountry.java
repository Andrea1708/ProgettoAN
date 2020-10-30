package OProject.ANSpringBootApp.Exception;


public class NoCountry extends Exception_Err {

		private static final long serialVersionUID = 1L; 

		/**
		 * get the exception message.
		 * @return String
		 */
		@Override
		public String getMessage() 
		{
			
			return "Questo Paese non fa parte della nostra lista!";
		}

	}
