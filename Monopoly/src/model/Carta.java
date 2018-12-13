package model;

public class Carta {
	
	private int clase;
	private String titulo;
	
	public Carta() {
		
	}

	public Carta(int clase, String titulo) {
		super();
		this.clase = clase;
		this.titulo = titulo;
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

	@Override
	public String toString() {
		return "Carta [clase=" + clase + ", titulo=" + titulo + "]";
	}
	
	

}
