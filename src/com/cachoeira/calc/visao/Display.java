package com.cachoeira.calc.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cachoeira.calc.modelo.Memoria;
import com.cachoeira.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("arial", Font.PLAIN, 25));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);
		
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
