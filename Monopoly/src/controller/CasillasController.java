package controller;

import model.Calle;
import model.Carcel;
import model.Carta;
import model.Casilla;
import model.Estacion;
import model.Ircarcel;
import model.Parking;

public class CasillasController {
	
	public Casilla mirarCasilla (Casilla casillas[],int numCasilla) {
		int num= numCasilla-1;
		
		return casillas[num];
		
	}
	
	
	public Calle mirarCalle(Calle casillasCalle[],int posicion) {
		
		return casillasCalle[posicion];
	}
	
	public Carta mirarCarta(Carta casillasCarta[],int posicion) {
		
		return casillasCarta[posicion];
	}
	
	public Estacion mirarEsacion(Estacion casillasEstacion[],int posicion) {
		
		return casillasEstacion[posicion];
	}
	
	public Carcel mirarCarcel(Carcel casillasCarcel[],int posicion) {
		
		return casillasCarcel[posicion];
	}
	
	public Ircarcel mirarIrcarcel(Ircarcel casillasIrcarcel[],int posicion) {
		return casillasIrcarcel[posicion];
	}
	
	public Parking mirarParking(Parking casillasParking[],int posicion) {
		return casillasParking[posicion];
	}
	
	

}
