package org.mphschool.Calculator;

import java.awt.Dimension;
import javax.swing.JTextField;

public class Display {
	
	private JTextField field;
	
	public Display() {
		field = new JTextField();
		field.setEditable(false);
		field.setPreferredSize(new Dimension(195, 70));
	}
	
	public JTextField getGUIComponent() {
		return field;
	}
	
	public void update(String text) {
		field.setText(text);
	}
}
