package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	SwingCalculator calculator = new SwingCalculator();
	private Display display;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new SwingCalculator();
		display = calculator.getDisplay();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(calculator);
	}
	
	@Test
	void testCalculatorType() {
		assertTrue(calculator instanceof SwingCalculator);
	}
	
	@Test
	void testClearClearsTheDisplay() {
		display.getGUIComponent().setText("99");
		
		calculator.clear();
		assertEquals("", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingSingleDigitUpdatesDisplay() {
		assertEquals("", display.getGUIComponent().getText());
		
		calculator.digitPressed("7");
		assertEquals("7", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingMultipleDigitsUpdatesDisplay() {
		assertEquals("", display.getGUIComponent().getText());
		
		calculator.digitPressed("1");
		calculator.digitPressed("2");
		assertEquals("12", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDecimalBeforeZeroAppendsZero() {
		calculator.digitPressed(".");
		assertEquals("0.", display.getGUIComponent().getText());
	}
	
	@Test
	void testZeroThenDecimalUpdatesDisplay() {
		calculator.digitPressed("0");
		calculator.digitPressed(".");
		assertEquals("0.", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDecimalTwiceWithDigitInBetween() {
		calculator.digitPressed(".");
		calculator.digitPressed("4");
		calculator.digitPressed(".");
		System.out.println(display.getGUIComponent().getText()); 
		assertEquals("0.4", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDecimalTwice() {
		calculator.digitPressed(".");
		calculator.digitPressed(".");
		assertEquals("0.", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDigitThenDecimalThenDigitThenDecimal() {
		calculator.digitPressed("2");
		calculator.digitPressed(".");
		calculator.digitPressed("2");
		calculator.digitPressed(".");
		assertEquals("2.2", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDigitThenDecimalThenDigitThenDecimalThenDigit() {
		calculator.digitPressed("2");
		calculator.digitPressed(".");
		calculator.digitPressed("2");
		calculator.digitPressed(".");
		calculator.digitPressed("2");
		assertEquals("2.22", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingZeroTwiceThenDecimalPutsOnlyOneLeadingZero() {
		calculator.digitPressed("0");
		calculator.digitPressed("0");
		assertEquals("0", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingMultipleZeroesAfterANumberWorks() {
		calculator.digitPressed("9");
		calculator.digitPressed("0");
		calculator.digitPressed("0");
		assertEquals("900", display.getGUIComponent().getText());
	}

	@Test
	void testPressingDigitAndThenAnotherDigitAndThenDecimalThenDigitWorks() {
		calculator.digitPressed("9");
		calculator.digitPressed("0");
		calculator.digitPressed(".");
		calculator.digitPressed("5");
		assertEquals("90.5", display.getGUIComponent().getText());
	}


}