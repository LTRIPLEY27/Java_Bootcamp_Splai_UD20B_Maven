package com.UD20B.model.Ejercicio4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class AreaTexto extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JTextArea texto;
	private JScrollPane scroll;
	private String textoMove = "";
	private final int ANCHO = 400;
	private final int LARGO = 400;
	
	
	public AreaTexto() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		label = new JLabel("Eventos");
		label.setBounds(15, 150, 80, 20);
		texto = new JTextArea("");
		texto.setBounds(60, 10, 300, 340);
		texto.setWrapStyleWord(true);
		texto.setLineWrap(true);
		texto.addMouseListener(mouse);
		scroll = new JScrollPane(texto);
		scroll.setBounds(60, 10, 300, 340);
		panel.add(label);
		panel.add(texto);
		panel.add(scroll);
		showPanel();
	}
	
	public void showPanel() {
		setTitle("Eventos en la ventana");
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
