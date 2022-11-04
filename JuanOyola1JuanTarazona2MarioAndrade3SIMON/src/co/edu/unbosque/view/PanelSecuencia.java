package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.*;
import java.util.Timer;

import javax.swing.*;

public class PanelSecuencia extends JPanel{
	private JTextField casilla1;
	private JTextField casilla2;
	private JTextField casilla3;
	private JTextField casilla4;
	private int contador;
	private TimerTask timertask;
	
	public PanelSecuencia() {
		casilla1 = new JTextField("");
		casilla2 = new JTextField("");
		casilla3 = new JTextField("");
		casilla4 = new JTextField("");
		casilla1.setEditable(false);
		casilla2.setEditable(false);
		casilla3.setEditable(false);
		casilla4.setEditable(false);
		setLayout(new GridLayout(1,4));
		add(casilla1);
		add(casilla2);
		add(casilla3);
		add(casilla4);
	}
	public void mostrarSecuencia(String n1, String n2, String n3,String n4) {
		int velocidad = 1;
		long velocidadMilisegundo = velocidad*600;		
		Timer timer = new Timer();
		timertask = new TimerTask() {
			@Override
			public void run() {
				switch(contador) {
				case 0:
					contador = 1;
					casilla1.setText(n1);
					if(n1.equals("1")) {
						casilla1.setBackground(Color.GREEN);
					}else if(n1.equals("2")) {
						casilla1.setBackground(Color.RED);
					}else if(n1.equals("3")) {
						casilla1.setBackground(Color.YELLOW);
					}else if(n1.equals("4")) {
						casilla1.setBackground(Color.CYAN);
					}
					break;
				case 1:
					contador = 2;
					casilla1.setText("");
					casilla1.setBackground(getBackground());
					casilla2.setText(n2);
					if(n2.equals("1")) {
						casilla2.setBackground(Color.GREEN);
					}else if(n2.equals("2")) {
						casilla2.setBackground(Color.RED);
					}else if(n2.equals("3")) {
						casilla2.setBackground(Color.YELLOW);
					}else if(n2.equals("4")) {
						casilla2.setBackground(Color.CYAN);
					}
					break;
				case 2:
					contador = 3;
					casilla2.setText("");
					casilla2.setBackground(getBackground());
					casilla3.setText(n3);
					if(n3.equals("1")) {
						casilla3.setBackground(Color.GREEN);
					}else if(n3.equals("2")) {
						casilla3.setBackground(Color.RED);
					}else if(n3.equals("3")) {
						casilla3.setBackground(Color.YELLOW);
					}else if(n3.equals("4")) {
						casilla3.setBackground(Color.CYAN);
					}
					break;
				case 3:
					contador = 4;
					casilla3.setText("");
					casilla3.setBackground(getBackground());
					casilla4.setText(n4);
					if(n4.equals("1")) {
						casilla4.setBackground(Color.GREEN);
					}else if(n4.equals("2")) {
						casilla4.setBackground(Color.RED);
					}else if(n4.equals("3")) {
						casilla4.setBackground(Color.YELLOW);
					}else if(n4.equals("4")) {
						casilla4.setBackground(Color.CYAN);
					}
					break;	
				case 4:
					casilla4.setText("");
					casilla4.setBackground(getBackground());
					timer.cancel();
					break;
				}				
			}			
		};
		timer.scheduleAtFixedRate(timertask, velocidadMilisegundo, velocidadMilisegundo);
		
	}
}
