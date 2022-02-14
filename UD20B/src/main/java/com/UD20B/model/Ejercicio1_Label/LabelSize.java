package com.UD20B.model.Ejercicio1_Label;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LabelSize extends JFrame{

		private JPanel panel;
		private JLabel label;
		private JButton maximixar;
		private JButton restaurar;
		private JButton cerrar;
		
		public LabelSize() {
			
			panel = new JPanel();
			panel.setLayout(null);
			setContentPane(panel);
		
			label = new JLabel("Quieres jugar con el tamaño de mi letra?");
			label.setBounds(80, 80, 400, 200);
			maximixar = new JButton("maximixar");
			maximixar.setBounds(50, 250, 100, 20);
			restaurar = new JButton("restaurar");
			restaurar.setBounds(130, 250, 100, 20);
			cerrar = new JButton("cerrar");
			cerrar.setBounds(220, 250, 100, 20);
			
			panel.add(label);
			panel.add(maximixar);
			maximixar.addActionListener(act);
			panel.add(restaurar);
			restaurar.addActionListener(act);
			panel.add(cerrar);
			cerrar.addActionListener(act);
			setVisible();
		}
		
		//MÉTODO PARA HACER VISIBLE EL FRAME EN EL CONSTRUCTOR
		public void setVisible() {
			setTitle("Cambia letras");
			setBounds(400, 400, 400, 400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
		//DEFINICION DEL ACTION LISTENER
		ActionListener act = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == maximixar) {
				label.setFont(new Font("Arial", Font.ITALIC, label.getFont().getSize() + 2));//LOS MÉTODOS DE LAS FONTS TIENEN ACCESO AL CAMBIO DE LETRAM, TAMAÑO Y ESTILO	
			} if(e.getSource() == restaurar) {
				label.setFont(new Font("Arial", Font.ITALIC, label.getFont().getSize() - 2));
			} if(e.getSource() == cerrar) {
				panel.setVisible(false);
			}
		}
		};
}
