package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;

public class MockCalculator implements Calculator {
	
	public boolean clearWasCalled;
	public Boolean diditPressedWasCalled;
	public String digitThatWasPressed;
		
	
	@Override
	public void clear() {
		clearWasCalled = true;

	}
	
	@Override
	public void digitPressed(String whichDigit) {
		
	}

}
