package com.UD20B.model.Ejercicio3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CounterIntents extends JFrame {
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JButton boton1;
	private JButton boton2;
	private int cont1 = 0;
	private int cont2 = 0;
	private final int ANCHO = 400;
	private final int LARGO = 400;
	
	public CounterIntents() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		label1 = new JLabel("");
		label2 = new JLabel("");
		label1.setBounds(60, 20, 300, 20);
		label2.setBounds(60, 40, 300, 20);
		boton1 = new JButton("boton1");
		boton2 = new JButton("boton2");
		boton1.setBounds(100, 100, 100, 20);
		boton2.setBounds(190, 100, 100, 20);
		boton1.addActionListener(act);
		boton2.addActionListener(act);
		panel.add(label1);
		panel.add(label2);
		panel.add(boton1);
		panel.add(boton2);
		showPanel();
	}
	
	public void showPanel() {
		setTitle("Cuenta botones");
		setSize(ANCHO, LARGO);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	ActionListener act = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == boton1) {
				cont1++;
				label1.setText("Has pulsado el boton 1 " + cont1 + " cantidad de veces");
			} else {
				cont2++;
				label2.setText("Has pulsado el boton 2 " + cont2 + " cantidad de veces");
			}
		}
	};
}
