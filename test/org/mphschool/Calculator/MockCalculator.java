package org.mphschool.Calculator;

public class MockCalculator implements Calculator {
	
	public boolean clearWasCalled;
	@Override
	public void clear() {
		clearWasCalled = true;

	}

}
