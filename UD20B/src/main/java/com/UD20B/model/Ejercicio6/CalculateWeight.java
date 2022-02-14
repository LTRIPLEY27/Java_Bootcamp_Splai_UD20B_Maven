package com.UD20B.model.Ejercicio6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
/*
 * @uthor: Isabel Calzadilla
 * UD20B : Ejercicio6
 * */
public class CalculateWeight extends JFrame {
	
	private JPanel panel;
	private final int ANCHO = 400;
	private final int LARGO = 400;
	private JButton boton;
	private JTextField altura;
	private JTextField peso;
	private JTextField calculo;
	private JLabel alturaText;
	private JLabel pesoText;
	private JLabel calculoText;
	private double indice;
	
	
	public CalculateWeight() {
		
		panel = new JPanel();
		alturaText = new JLabel("Altura (MT)"); 
		pesoText = new JLabel("Peso (KG)"); 
		calculoText= new JLabel("IMC");
		alturaText.setBounds(60, 80, 80, 30);
		pesoText.setBounds(180, 80, 80, 30);
		boton = new JButton("Calcular");
		boton.setBounds(60, 120, 100, 30);
		calculoText.setBounds(200, 120, 80, 30);
		
		altura = new JTextField();
		altura.setBounds(125, 85, 40, 20);
		peso = new JTextField();
		peso.setBounds(240, 85, 40, 20);
		calculo = new JTextField();
		calculo.setBounds(230, 125, 40, 20);
		
		panel.add(alturaText);
		panel.add(altura);
		panel.add(pesoText);
		panel.add(peso);
		panel.add(boton);
		panel.add(calculoText);
		panel.add(calculo);
		boton.addActionListener(act);
		showPanel();
 	}
	
	public void showPanel() {
		panel.setLayout(null);
		setContentPane(panel);
		setTitle("Índice masa corporal");
		setSize(ANCHO, LARGO);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	ActionListener act= new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DecimalFormat decima = new DecimalFormat("#.##");
			double pesoCal = Double.parseDouble(peso.getText());
			double alturaCal = Double.parseDouble(altura.getText());
			indice = pesoCal / Math.pow(alturaCal, 2);
			calculo.setText(String.valueOf(decima.format(indice)));
		}
		
	};
}
