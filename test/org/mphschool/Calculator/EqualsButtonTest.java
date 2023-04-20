package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualsButtonTest {
	EqualsButton button = new EqualsButton();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	@Test
	void testIsButton() {
		assertTrue(button.createGuiButton() instanceof JButton);
	}
	
	@Test
	void testColor() {
		assertEquals(button.createGuiButton().getBackground(), Color.blue);
	}
	
	@Test
	void testLabel() {
		assertEquals(button.createGuiButton().getText(), "=");
	}

}