package com.cachoeira.calc.visao;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
	
		organizarLayout();
		
		setSize(232, 322);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new DimensionUIResource(233, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
