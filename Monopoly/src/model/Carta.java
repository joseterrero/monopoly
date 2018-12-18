package model;

public class Carta {
	
	private int clase;
	private String titulo;
	private double cantidad;
	private int accion;
	
	public Carta() {
		
	}

	public Carta(int clase, String titulo, double cantidad, int accion) {
		super();
		this.clase = clase;
		this.titulo = titulo;
		this.cantidad = cantidad;
		this.accion = accion;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
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
