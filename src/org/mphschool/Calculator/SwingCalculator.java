package org.mphschool.Calculator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingCalculator extends JFrame implements Calculator{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.out.println("calculator started");
		calculator.launchGui();
		

	}
	private Display display;
	
	public SwingCalculator() {
		super("Calculator");
		
		display = new Display();
	}
	
	public Display getDisplay() {
		return display;
	
	}
	
	private void launchGui() {

		
		JPanel firstRow = new JPanel();
		ClearButton clearButton = new ClearButton(this);
		firstRow.add(clearButton.createGuiButton());
		add(firstRow);
		
		Display display = new Display();
		firstRow.add(display.getGuiComponent());
		
		add(firstRow);
		
		JPanel secondRow = new JPanel();
		
		DigitButton sevenButton = new DigitButton("7");
		secondRow.add(sevenButton.createGuiButton());
		
		DigitButton eightButton = new DigitButton("8");
		secondRow.add(eightButton.createGuiButton());
		
		DigitButton nineButton = new DigitButton("9");
		secondRow.add(nineButton.createGuiButton());
		
		DigitButton addButton = new DigitButton("+");
		secondRow.add(addButton.createGuiButton());
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		add(secondRow);
		

		JPanel thirdRow = new JPanel();
		
		DigitButton fourButton = new DigitButton("4");
		thirdRow.add(fourButton.createGuiButton());
		
		DigitButton fiveButton = new DigitButton("5");
		thirdRow.add(fiveButton.createGuiButton());
		
		DigitButton sixButton = new DigitButton("6");
		thirdRow.add(sixButton.createGuiButton());
		
		DigitButton subtractButton = new DigitButton("-");
		thirdRow.add(subtractButton.createGuiButton());
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		add(thirdRow);
		
		
		JPanel fourthRow = new JPanel();
		
		DigitButton oneButton = new DigitButton("1");
		fourthRow.add(oneButton.createGuiButton());
		
		DigitButton twoButton = new DigitButton("2");
		fourthRow.add(twoButton.createGuiButton());
		
		DigitButton threeButton = new DigitButton("3");
		fourthRow.add(threeButton.createGuiButton());
		
		DigitButton multiplyButton = new DigitButton("*");
		fourthRow.add(multiplyButton.createGuiButton());
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		add(fourthRow);
		
		
		JPanel fifthRow = new JPanel();
		
		DigitButton decimalButton = new DigitButton(".");
		fifthRow.add(decimalButton.createGuiButton());
		
		DigitButton zeroButton = new DigitButton("0");
		fifthRow.add(zeroButton.createGuiButton());
		
		EqualsButton equalsButton = new EqualsButton();
		fifthRow.add(equalsButton.createGuiButton());
		
		DigitButton divideButton = new DigitButton("/");
		fifthRow.add(divideButton.createGuiButton());
		
		
		
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		add(fifthRow);
		
		
		
		setSize(250,350);
		setPreferredSize(getSize());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
