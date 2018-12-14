package model;

public class Jugador {

	private String nombre;
	private double dinero;
	private int posicion;
	public String color;

	public Jugador() {

	}

	public Jugador(String nombre, double dinero, int posicion, String color) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.posicion = posicion;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Dinero: " + dinero + ", Posicion: " + posicion + ", Color: " + color;
	}

}
