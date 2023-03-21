package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class ClearButton {
	
	public JButton createGuiButton() {
		JButton button=new JButton("C");
		button.setPreferredSize(new Dimension(50,50));
		return button;
	}
}
