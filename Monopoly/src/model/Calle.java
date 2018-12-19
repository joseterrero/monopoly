package model;

public class Calle {
	
	private String nombre;
	private double precio;
	private boolean casa;
	private Jugador jugador;
	private double alquiler;
	
	public Calle() {
		
	}
	
	public Calle(String nombre, double precio, double alquiler) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.alquiler = alquiler;
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

	public boolean isCasa() {
		return casa;
	}

	public void setCasa(boolean casa) {
		this.casa = casa;
	}

	public double getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(double alquiler) {
		this.alquiler = alquiler;
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
