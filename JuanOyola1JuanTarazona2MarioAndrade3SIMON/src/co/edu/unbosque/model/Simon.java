package co.edu.unbosque.model;

import java.util.Random;

public class Simon {
		
	private String arregloSecuencia[];
	public static final int NESPACIOS = 4;
	private String secuencia[];
	int i;
	
	public Simon() {
		i = 0;
		arregloSecuencia = new String[NESPACIOS];
		secuencia = new String[NESPACIOS];
		arregloSecuencia[0] = "1";
		arregloSecuencia[1] = "2";
		arregloSecuencia[2] = "3";
		arregloSecuencia[3] = "4";		
	}
	public String hacerSecuencia() {
		String m1;
		Random r = new Random();
		m1 = arregloSecuencia[r.nextInt(NESPACIOS)];
		return m1;
	}
	
	public int compararSecuencia(String pSec, String pSecu) {
		if(pSec.equals(pSecu)) {
			return 0;
		}else {
			return -1;
		}
	}	
	public void ponerN1() {
		secuencia[i] = "1";
		i++;
	}
	public void ponerN2() {
		secuencia[i] = "2";
		i++;
	}
	public void ponerN3() {
		secuencia[i] = "3";
		i++;
	}
	public void ponerN4() {
		secuencia[i] = "4";
		i++;
	}
		
	public String[] getSecuencia() {
		return secuencia;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setSecuencia(String[] secuencia) {
		this.secuencia = secuencia;
	}
}
