package org.mphschool.Calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.out.println("calculator started");
		
		new Calculator();
	}
	
	public Calculator() {
		super("Calculator");
		System.out.println("in calculator constructor");
		
		JPanel panel = new JPanel();
		ClearButton clearButton = new ClearButton();
		panel.add(clearButton.createGuiButton());
		add(panel);
		
		Display display = new Display();
		panel.add(display.createGuiComponent());
		
		setSize(250,350);
		setPreferredSize(getSize());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
