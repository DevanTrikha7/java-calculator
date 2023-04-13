package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClearButtonTest {

	private ClearButton button;
	private MockCalculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		button=new ClearButton(calculator);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);	
	}
	
	@Test
	void testDisplaysC() {
		JButton btn=button.createGuiButton();
		assertEquals("C",btn.getText());
	}
	
	@Test 
	void testButtonIsCorrectSize() {
		JButton btn = button.createGuiButton();
		assertEquals(50.0, btn.getPreferredSize().getWidth(), 0.001);
		assertEquals(50.0, btn.getPreferredSize().getHeight(), 0.001); }
	
	@Test 
	void testClickingTheButtonCallsClearOnTheCalulator() {
		JButton btn = button.createGuiButton();
		assertEquals("C", btn.getText());
		
	}
	
	@Test 
	void testClickingTheButtonCallsClearOnTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.clearWasCalled);
	}

}
