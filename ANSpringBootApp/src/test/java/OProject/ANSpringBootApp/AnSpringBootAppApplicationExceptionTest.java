package OProject.ANSpringBootApp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import OProject.ANSpringBootApp.Exception.NoCountry;
import OProject.ANSpringBootApp.Model.States;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
class AnSpringBootAppApplicationExceptionTest {
	
	private States country1 = null;
	
	
@BeforeEach
void setUP() throws Exception{
	country1 = new States ("Venezuela","venezula", "VE");
}


@AfterEach
void tearDown() throws Exception {
}

/**
 * Test of the NoCountry Exception
 */
@Test
void nocountryTest() {
	NoCountry exception = assertThrows(NoCountry.class,()-> {
		Check(country1);
	});
	
	assertTrue(exception.getMessage().contains("Questo Paese non fa parte della nostra lista!"));
}

boolean Check (States test) throws NoCountry {
	throw new NoCountry();
}
}
