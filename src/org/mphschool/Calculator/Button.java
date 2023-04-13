package org.mphschool.Calculator;

import java.awt.Dimension;

import javax.swing.JButton;

public class Button {
	
	private String label; 
	
	public Button(String theLabel) {
		label = theLabel;
	}
	
	public JButton createGuiButton() {
		JButton button=new JButton(label);
		button.setPreferredSize(new Dimension(50,50));
		return button;
	}

}
