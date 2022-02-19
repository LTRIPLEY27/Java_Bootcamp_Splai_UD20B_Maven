package com.UD20B.model.Ejercicio8;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Conversor extends JFrame {
	private JPanel panel;
	private JTextField txtMoney;
	private JTextField txtConvert;
	private JLabel showMoney;
	private JButton euros;
	private JButton pesetas;
	private double cambio;
	private JLabel lblNewLabel;
	private JButton btnBorrar;
	private final double PESETAS = 166.386;

	public Conversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel cantidad = new JLabel("Cantidad a convertir");
		cantidad.setBounds(26, 56, 128, 14);
		panel.add(cantidad);
		
		txtMoney = new JTextField();
		txtMoney.setBounds(164, 53, 86, 20);
		panel.add(txtMoney);
		txtMoney.setColumns(10);
		
		JLabel conversion = new JLabel("Resultado");
		conversion.setBounds(260, 56, 75, 14);
		panel.add(conversion);
		
		txtConvert = new JTextField();
		txtConvert.setEnabled(false);
		txtConvert.setBounds(320, 53, 86, 20);
		panel.add(txtConvert);
		txtConvert.setColumns(10);
		
		euros = new JButton("Euros a Ptas");
		euros.setBounds(46, 96, 113, 23);
		euros.addActionListener(act);
		panel.add(euros);
		
		pesetas = new JButton("Cambiar");
		pesetas.setBounds(166, 96, 114, 23);
		pesetas.addActionListener(act);
		panel.add(pesetas);
		
		showMoney = new JLabel("");
		showMoney.setEnabled(false);
		showMoney.setBounds(320, 31, 104, 14);
		panel.add(showMoney);
		
		lblNewLabel = new JLabel("Conversor de Monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(146, 11, 168, 14);
		panel.add(lblNewLabel);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(290, 96, 114, 23);
		btnBorrar.addActionListener(act);
		panel.add(btnBorrar);
	}
	
	ActionListener act = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {//EXCEPTION QUE DISPARA SI EL FORMATO NO ES NUMERICO
				double convert = Double.parseDouble(txtMoney.getText());
					if(e.getSource() == euros) {
						cambio = convert * PESETAS;
						showMoney.enable(true);
						showMoney.setText("Cambio Euros");
						txtConvert.setText(String.valueOf(cambio));
					} if(e.getSource() == pesetas) {
						cambio = convert / PESETAS;
						showMoney.enable(true);
						showMoney.setText("Cambio Pesetas");
						txtConvert.setText(String.valueOf(cambio));
					}
					 if(e.getSource() == btnBorrar) {
						txtMoney.setText(" ");
						txtConvert.setText(" ");
					}}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(panel, "DEBE DE INTRODUCIR NÚMEROS");	
			}
		}
	};

}
