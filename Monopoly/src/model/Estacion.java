package model;

public class Estacion {
	
	private String nombre;
	private double precio;
	private Jugador jugador;
	private double alquiler;
	
	public Estacion() {
		
	}

	public Estacion(String nombre, double precio, double alquiler) {
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

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public double getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(double alquiler) {
		this.alquiler = alquiler;
	}

	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", precio=" + precio + ", jugador=" + jugador + ", alquiler=" + alquiler
				+ "]";
	}
	
	
	
	

}
