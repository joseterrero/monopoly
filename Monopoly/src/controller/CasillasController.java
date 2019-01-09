package controller;

import datos.CasillasDatos;

public class CasillasController {
	
	public Casilla mirarCasilla (int numCasilla) {
		int num= numCasilla-1;
		
		return datos.CasillasDatos.getCasillas[num];
		
	}

}
