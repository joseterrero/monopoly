package model;

public class Calle {
	
	private String nombre;
	private double precio;
	private int casa;
	private Jugador jugador;
	
	public Calle() {
		
	}

	public Calle(String nombre, double precio, int casa, Jugador jugador) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.casa = casa;
		this.jugador = jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCasa() {
		return casa;
	}

	public void setCasa(int casa) {
		this.casa = casa;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Calle [nombre=" + nombre + ", precio=" + precio + ", casa=" + casa + ", jugador=" + jugador + "]";
	}
	
}
