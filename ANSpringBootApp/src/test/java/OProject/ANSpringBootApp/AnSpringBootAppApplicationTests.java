package OProject.ANSpringBootApp;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

@SpringBootTest
class AnSpringBootAppApplicationTests {
	
	private States Paese1 = null;
	private Nation Paese2 = null;
	List<States> ls = null;
	List<Nation> ln = null;
	
		

@BeforeEach
	void setUp() throws Exception {
	Paese1 = new States("Italy","italy","IT");
	Paese2 = new Nation("Bolivia","BO","-16.29","-63.59",330,27,2,301,"2020-04-13T00:00:00Z");
	ls = new ArrayList<States>();
	ln = new ArrayList<Nation>();
	ls.add(Paese1);
	ln.add(Paese2);
}
		
@AfterEach
void tearDown() throws Exception {
}

/**
 * States method
 */
@Test   
void test1() {
	assertEquals("Italy", Paese1.getCountry());
	assertEquals("italy", Paese1.getSlug());
	assertEquals("IT",Paese1.getISO2());
}

/**
 * Nation method
 */
@Test 
void test2() {
	assertEquals("Bolivia",Paese2.getCountry());
	assertEquals("BO",Paese2.getCountryCode());
	assertEquals("-16.29",Paese2.getLat());
	assertEquals("-63.59",Paese2.getLon());
	assertEquals(330,Paese2.getConfirmed());
	assertEquals(27,Paese2.getDeaths());
	assertEquals(2,Paese2.getRecovered());
	assertEquals(301,Paese2.getActive());
	assertEquals("2020-04-13T00:00:00Z",Paese2.getDate());
	
	
}
		
}
