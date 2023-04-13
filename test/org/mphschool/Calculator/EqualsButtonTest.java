package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualsButtonTest {

	private EqualsButton button;

	@BeforeEach
	void setUp() throws Exception {
		button = new EqualsButton();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNOtNull() {
		assertNotNull(button);
		
	}
	@Test 
	void testButtonIsCorrectSize() {
		JButton btn = button.createGuiButton();
		assertEquals(50.0, btn.getPreferredSize().getWidth(), 0.01);
		assertEquals(50.0, btn.getPreferredSize().getHeight(), 0.01);

}

	
}
