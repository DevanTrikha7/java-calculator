package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mphschool.Calculator.Display;

class DisplayTest {
	
	Display display;
	
	@BeforeEach
	void setUp() throws Exception{
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
	void testEqualsTextField() {
		Object dis = display.getGUIComponent();
		assertNotNull(dis);
		assertTrue(dis instanceof JTextField);
	}
	
	@Test
	void testIsEditable() {
		JTextField dis = display.getGUIComponent();
		assertTrue(!dis.isEditable());
	}
	
	@Test
	void testIsCorrectSize() {
		JTextField dis = display.getGUIComponent();
		assertEquals(195.0, dis.getPreferredSize().getWidth(), 0.001);
		assertEquals(70.0, dis.getPreferredSize().getHeight(), 0.001);
	}
	
	@Test
	void testUpdateSetText() {
		JTextField dis = display.getGUIComponent();
		display.update("7");
		assertEquals("7", dis.getText());
	}
	
}