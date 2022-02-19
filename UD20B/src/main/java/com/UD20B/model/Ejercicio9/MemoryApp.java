package com.UD20B.model.Ejercicio9;

import java.awt.EventQueue;

public class MemoryApp {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Memory frame = new Memory();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}

}
