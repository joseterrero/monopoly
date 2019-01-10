package model;

public class Jugador {

	private String nombre;
	private double dinero;
	private int posicion;
	private int player;
	private int turno;
	private boolean cambio;

	public Jugador() {

	}

	public Jugador(String nombre, double dinero, int posicion, int player, int turno, boolean cambio) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.posicion = posicion;
		this.player = player;
		this.turno = turno;
		this.cambio = cambio;

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

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public boolean getCambio() {
		return cambio;
	}

	public void setCambio(boolean cambio) {
		this.cambio = cambio;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}