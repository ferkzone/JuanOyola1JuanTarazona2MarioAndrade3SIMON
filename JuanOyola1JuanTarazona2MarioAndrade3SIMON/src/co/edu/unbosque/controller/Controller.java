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
		String secuU="";
		String[] secuencia = new String[4];
		if(e.getActionCommand().equals(gui.getPanelbotones().A)){
			s.ponerN1();		
		}if(e.getActionCommand().equals(gui.getPanelbotones().B)) {	
			s.ponerN2();
		}if(e.getActionCommand().equals(gui.getPanelbotones().C)) {
			s.ponerN3();
		}else if(e.getActionCommand().equals(gui.getPanelbotones().D)) {
			s.ponerN4();
		}
		else if(e.getActionCommand().equals(gui.TERMINAR)) {
			secuencia = s.getSecuencia();
			for(int i =0;i<4;i++) {
				secuU += secuencia[i];
			}
			if(s.compararSecuencia(secuU,secuP)==0) {				
				gui.mostrarExito("Secuencia exitosa!");
				gui.setVisible(false);
			}else {
				gui.mostrarFallo("Fallaste!");
				gui.setVisible(false);		
			}			
		}		
	}
		
}
