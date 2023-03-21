package org.mphschool.Calculator;

import java.awt.Dimension;

import javax.swing.JTextField;

public class Display {

	public JTextField createGuiComponent() {
		JTextField field = new JTextField();
		field.setPreferredSize(new Dimension(150,50));
		return field;
		
	}
	

}
