package model;

public class Casilla {

	private int tipo;
	private int posicion;
	
	
	public Casilla(int tipo, int posicion) {
		this.tipo = tipo;
		this.posicion = posicion;
	}


	public int getTipo() {
		return tipo;
	}


	public int getPosicion() {
		return posicion;
	}
	
}
