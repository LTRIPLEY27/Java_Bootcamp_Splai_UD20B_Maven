package com.UD20B.model.Ejercicio2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LastButton extends JFrame {

	private JPanel panel;
	private JButton boton1;
	private JButton boton2;
	private JLabel etiqueta;
	private final int ANCHO = 400;
	private final int LARGO = 400;
	
	public LastButton() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		etiqueta = new JLabel("");
		etiqueta.setBounds(60, 60, 300, 40);
		boton1 = new JButton("Boton1");
		boton2 = new JButton("Boton2");
		boton1.setBounds(100, 100, 100, 20);
		boton2.setBounds(190, 100, 100, 20);
		panel.add(etiqueta);
		panel.add(boton1);
		boton1.addActionListener(acting);
		boton2.addActionListener(acting);
		panel.add(boton2);
		showPanel();
	}
	
	public void showPanel() {
		setTitle("muestra eleccion");
		setSize(ANCHO, LARGO);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	ActionListener acting = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == boton1) {
				etiqueta.setText("Has presionado : el boton1");
			} else {
				etiqueta.setText("Has presionado : el boton2");
			}
		}
	};
}
