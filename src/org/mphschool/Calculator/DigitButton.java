package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DigitButton extends Button {
	
	public DigitButton(Calculator calculator, String theLabel) {
		super(calculator, theLabel);
	}
	
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getCalculator().digitPressed(getLabel());
			}
		});
		button.setBackground(Color.gray);
		return button;
	}
}