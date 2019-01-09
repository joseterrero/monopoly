package model;

public class Jugador {

	private String nombre;
	private double dinero;
	private int posicion;
	private int posicionAnterior;
	public int player;

	public Jugador() {

	}

	public Jugador(String nombre, double dinero, int posicion, int posicionAnterior, int player) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.posicion = posicion;
		this.player = player;
		this.posicionAnterior = posicionAnterior;
	}

	public int getPlayer() {
		return player;
	}
	

	public void setPlayer(int player) {
		this.player = player;
	}
	
	public int getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(int posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dinero=" + dinero + ", posicion=" + posicion + ", player=" + player
				+ "]";
	}

}
