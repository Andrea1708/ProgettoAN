package OProject.ANSpringBootApp.Exception;

public abstract class ExceptionManager extends RuntimeException {
		private static final long serialVersionUID= 1L;
		/**
		 * Ottiene il messaggio da stampare
		 * @return String
		 */
		public abstract String getMessage();
}
