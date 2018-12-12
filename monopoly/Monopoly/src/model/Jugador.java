package model;

public class Jugador {
	
	private String nombre;
	private double dinero;
	private int ficha;
	
	public Jugador() {
		
	}

	public Jugador(String nombre, double dinero, int ficha) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.ficha = ficha;
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

	public int getFicha() {
		return ficha;
	}

	public void setFicha(int ficha) {
		this.ficha = ficha;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dinero=" + dinero + ", ficha=" + ficha + "]";
	}
	
}
