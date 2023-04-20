package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

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
		button = new ClearButton(calculator);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	@Test
	void testCreateGuiButton() {
		Object btn = button.createGuiButton();
		assertNotNull(btn);
		assertTrue(btn instanceof JButton);
	}
	
	@Test
	void testButtonLabelIsC() {
		JButton btn = button.createGuiButton();
		assertEquals("C", btn.getText());
	}
	
	@Test
	void testButtonColor() {
		JButton btn = button.createGuiButton();
		assertEquals(btn.getBackground(), Color.red);
	}

	@Test
	void testClickingTheButtonCallsClearTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.clearWasCalled);
	}
}