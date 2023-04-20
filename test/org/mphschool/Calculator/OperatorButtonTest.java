package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperatorButtonTest {

	private MockCalculator calculator;
	private OperatorButton button;
	private String label;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		label = "+";
		button = new OperatorButton(calculator, label);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull (button);
	}
	
	@Test
	void testCreateGuiButtonCreatesJButton() {
		Object obj = button.createGuiButton();
		assertNotNull(obj);
		assertTrue(obj instanceof JButton);	
		
	}
	
	@Test 
	void testLableIsCorrect() {
		JButton btn = button.createGuiButton();;
		assertEquals(label, btn.getText());
		
	}
	
	@Test 
	void testButtonIsCorrectSize() {
		JButton btn = button.createGuiButton();
		assertEquals(50.0, btn.getPreferredSize().getWidth(), 0.01);
		assertEquals(50.0, btn.getPreferredSize().getHeight(), 0.01);

	}

}
