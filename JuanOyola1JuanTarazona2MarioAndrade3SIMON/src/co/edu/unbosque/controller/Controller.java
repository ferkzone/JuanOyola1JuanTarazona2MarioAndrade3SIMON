package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View gui;
	private Simon s = new Simon();
	private String n1 = s.hacerSecuencia();
	private String n2 = s.hacerSecuencia();
	private String n3 = s.hacerSecuencia();
	private String n4 = s.hacerSecuencia();
	private String secuP = n1+n2+n3+n4;	
	
	public Controller() {
		gui = new View(this);
		gui.setVisible(true);	
		gui.getPanelsecuencia().mostrarSecuencia(n1,n2,n3,n4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String m1="",m2="",m3="",m4="",secuU="";
		if(e.getActionCommand().equals(gui.getPanelbotones().A)){
			m1 = "1";
		}else if(e.getActionCommand().equals(gui.getPanelbotones().B)) {			
			m2 = "2";
		}else if(e.getActionCommand().equals(gui.getPanelbotones().C)) {
			m3 = "3";
		}else if(e.getActionCommand().equals(gui.getPanelbotones().D)) {
			m4 = "4";
		}
		else if(e.getActionCommand().equals(gui.TERMINAR)) {
			secuU = m1+m2+m3+m4; 
			System.out.println(secuU);
			if(s.compararSecuencia(secuU, secuP)==0) {				
				gui.mostrarExito("Secuencia exitosa!");				
			}else {
				gui.mostrarFallo("Fallaste!");
			}
		}
	}
	
	
}
