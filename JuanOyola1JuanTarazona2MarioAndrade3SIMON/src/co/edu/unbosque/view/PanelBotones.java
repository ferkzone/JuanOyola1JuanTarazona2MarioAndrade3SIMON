package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelBotones extends JPanel{
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	public static final String A = "1";
	public static final String B = "2";
	public static final String C = "3";
	public static final String D = "4";
	
	public PanelBotones(){
		setLayout(new BorderLayout());
		add(crearBotonesJuntos(),BorderLayout.CENTER);
	}
	public JPanel crearBotonesJuntos() {
		JPanel panel = new JPanel();
		boton1 = new JButton("1");
		boton2 = new JButton("2");
		boton3 = new JButton("3");
		boton4 = new JButton("4");
		boton1.setBackground(Color.GREEN);
		boton2.setBackground(Color.RED);
		boton3.setBackground(Color.YELLOW);
		boton4.setBackground(Color.CYAN);
		boton1.setActionCommand(A);
		boton2.setActionCommand(B);
		boton3.setActionCommand(C);
		boton4.setActionCommand(D);	
		boton1.setFocusPainted(false);
		boton2.setFocusPainted(false);
		boton3.setFocusPainted(false);
		boton4.setFocusPainted(false);
		panel.setLayout(new GridLayout(2,2));
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		return panel;		
	}
	

	/**
	 * @return the boton1
	 */
	public JButton getBoton1() {
		return boton1;
	}
	/**
	 * @param boton1 the boton1 to set
	 */
	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}
	/**
	 * @return the boton2
	 */
	public JButton getBoton2() {
		return boton2;
	}
	/**
	 * @param boton2 the boton2 to set
	 */
	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}
	/**
	 * @return the boton3
	 */
	public JButton getBoton3() {
		return boton3;
	}
	/**
	 * @param boton3 the boton3 to set
	 */
	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	}
	/**
	 * @return the boton4
	 */
	public JButton getBoton4() {
		return boton4;
	}
	/**
	 * @param boton4 the boton4 to set
	 */
	public void setBoton4(JButton boton4) {
		this.boton4 = boton4;
	}
	
	
	
}
