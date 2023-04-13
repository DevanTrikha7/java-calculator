package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClearButton extends Button{
	
	private Calculator calculator;
	
	public ClearButton(Calculator calculator) {
		super("C");
		this.calculator = calculator;
		
	}
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculator.clear();
				
			}
			
		});
		return button;
	}
	
}

