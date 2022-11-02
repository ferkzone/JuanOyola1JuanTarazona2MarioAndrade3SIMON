package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private PanelSecuencia panelsecuencia;
	private PanelBotones panelbotones;
	private JButton terminarbut;
	private JLabel numeroLabel;
	public static final String TERMINAR = "TERMINAR";
	
	public View(Controller pControl) {
		panelsecuencia = new PanelSecuencia();
		panelbotones = new PanelBotones();
		terminarbut = new JButton("Terminar");
		numeroLabel = new JLabel("Número");
		setSize(600,600);
		setResizable(false);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		terminarbut.setActionCommand(TERMINAR);
		panelbotones.getBoton1().addActionListener(pControl);
		panelbotones.getBoton2().addActionListener(pControl);
		panelbotones.getBoton3().addActionListener(pControl);
		panelbotones.getBoton4().addActionListener(pControl);
		terminarbut.addActionListener(pControl);
		panelbotones.setBounds(137, 120, 300, 300);
		terminarbut.setBounds(250,500,100,30);
		panelsecuencia.setBounds(250, 50, 150,30);
		numeroLabel.setBounds(200, 50, 150, 30);
		add(panelbotones);
		add(terminarbut);
		add(panelsecuencia);
		add(numeroLabel);
	}
	public void mostrarExito(String pMensaje) {
		JOptionPane.showMessageDialog(null, pMensaje);
	}
	public void mostrarFallo(String pMensaje) {
		JOptionPane.showMessageDialog(null,pMensaje,null,JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * @return the panelsecuencia
	 */
	public PanelSecuencia getPanelsecuencia() {
		return panelsecuencia;
	}

	/**
	 * @return the panelbotones
	 */
	public PanelBotones getPanelbotones() {
		return panelbotones;
	}

	/**
	 * @return the terminarbut
	 */
	public JButton getTerminarbut() {
		return terminarbut;
	}

	/**
	 * @return the numeroLabel
	 */
	public JLabel getNumeroLabel() {
		return numeroLabel;
	}
	
	
	
}
