package model;

public class Jugador {

	private String nombre;
	private double dinero;
	private int posicion;
<<<<<<< HEAD
	private int posicionAnterior;
	private int player;
	private int carcel;
=======
	public int player;
>>>>>>> d2eb91dc0a37231aca54642fe7ad3ba50080475b

	public Jugador() {

	}

<<<<<<< HEAD
	public Jugador(String nombre, double dinero, int posicion, int player,int posicionAnterior,int carcel) {
		super();
=======
	public Jugador(String nombre, double dinero, int posicion, int player) {
>>>>>>> d2eb91dc0a37231aca54642fe7ad3ba50080475b
		this.nombre = nombre;
		this.dinero = dinero;
		this.posicion = posicion;
		this.player = player;
<<<<<<< HEAD
		this.posicionAnterior = posicionAnterior;
		this.carcel = carcel;
=======
>>>>>>> d2eb91dc0a37231aca54642fe7ad3ba50080475b
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
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
		return "nombre: " + nombre + ", dinero: " + dinero + ", posicion: " + posicion + ", player: " + player;
	}

}
