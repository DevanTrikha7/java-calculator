package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitButtonTest {
	
	DigitButton button;
	
	@BeforeEach
	void setUp() throws Exception {
		button = new DigitButton();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}

}
