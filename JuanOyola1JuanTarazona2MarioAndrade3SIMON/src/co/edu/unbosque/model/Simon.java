package co.edu.unbosque.model;

import java.util.Random;

public class Simon {
		
	private String arregloSecuencia[];
	public static final int NESPACIOS = 4;
	
	public Simon() {
		arregloSecuencia = new String[NESPACIOS];
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
	
}
