package com.UD20B.model.Ejercicio7;

import java.awt.EventQueue;

public class MoneyConversorApp {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MoneyConversor frame = new MoneyConversor();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

}
