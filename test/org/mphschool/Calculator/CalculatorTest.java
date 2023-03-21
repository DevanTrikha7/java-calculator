package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	
	
	Display display;
	

	@BeforeEach
	void setUp() throws Exception {
		display = new Display();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(display);
	}
	
	
	

}
