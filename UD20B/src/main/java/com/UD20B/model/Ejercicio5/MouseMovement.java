package com.UD20B.model.Ejercicio5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
/*
 * @uthor: Isabel Calzadilla
 * UD20B : Ejercicio5
 * */
public class MouseMovement extends JFrame{
	private JPanel panel;
	private JTextArea texto;
	private JButton boton;
	private final int ANCHO = 400;
	private final int LARGO = 400;
	
	public MouseMovement() {
		panel = new JPanel();
		texto = new JTextArea();
		texto.setBounds(30, 70, 320, 250);
		boton = new JButton("Clean");
		boton.setBounds(150, 40, 80, 20);
		panel.add(texto);
		panel.add(boton);
		texto.addMouseListener(mouse);
		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			texto.setText(" ");
			}
		});
		showPanel();
	}
	
	public void showPanel() {
		panel.setLayout(null);
		setContentPane(panel);
		setTitle("Eventos del mouse");
		setSize(ANCHO, LARGO);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	MouseListener mouse = new MouseListener() {
		public void mouseMoved(MouseEvent e) {
				texto.setText("Movimiento en el mouse 1");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			texto.setText("Haz clickado el mouse");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			texto.setText("Haz presionado el mouse");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			texto.setText("Movimiento en el mouse3");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			texto.setText("Haz entrado al área de texto");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			texto.setText("Haz salido de la ventana");
		}
	};
}
