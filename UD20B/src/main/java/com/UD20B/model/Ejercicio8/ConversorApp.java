package com.UD20B.model.Ejercicio8;

import java.awt.EventQueue;

public class ConversorApp {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Conversor frame = new Conversor();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
}
