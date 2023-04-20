package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;

public class OperatorButton extends Button {
	
	public OperatorButton(Calculator calculator, String theLabel) {
		super(calculator, theLabel);
	}
	
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		button.setBackground(Color.blue);
		return button;
	}
}