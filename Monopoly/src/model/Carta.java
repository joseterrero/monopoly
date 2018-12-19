package model;

public class Carta {
	
	private String clase;
	private String titulo;
	private double cantidad;
	private int accion;
	// Banca es tipo 1 y suerte es tipo 2
	private int tipo;
	
	public Carta() {
		
	}

	public Carta(String clase, String titulo, double cantidad, int accion) {
		super();
		this.clase = clase;
		this.titulo = titulo;
		this.cantidad = cantidad;
		this.accion = accion;
	}
	
	public Carta(int tipo) {
		this.tipo = tipo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getAccion() {
		return accion;
	}

	public void setAccion(int accion) {
		this.accion = accion;
	}

	@Override
	public String toString() {
		return "Carta [clase=" + clase + ", titulo=" + titulo + ", cantidad=" + cantidad + ", accion=" + accion + "]";
	}

}
