package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JTextField;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisplayTest {
	
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
	@Test
	 void testCreateGuiComponentCreatesJTextField() {
	  Object obj = display.createGuiComponent();
	  assertNotNull(obj);
	  assertTrue(obj instanceof JTextField);
	 }
	@Test 
	void testButtonIsCorrectSize() {
		JTextField field = display.createGuiComponent();
		assertEquals(150.0, field.getPreferredSize().getWidth(),0.001);
		assertEquals(50.0, field.getPreferredSize().getHeight(),0.001);
	}
}
