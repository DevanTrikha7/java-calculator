package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClearButton extends Button {
	
	
	public ClearButton(Calculator calculator) {
		super(calculator, "C");
	}
	
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		button.setBackground(Color.red);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getCalculator().clear();
				
			}
			
		});
		return button;
	}
}

