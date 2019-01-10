package crud;

import model.Jugador;

public class JugadorCrud {

	// METODOS AÑADIR, ELIMINAR, MOSTRAR DATOS DE JUGADOR Y ACTUALIZAR EL DINERO
	private boolean cambio;

	public JugadorCrud() {

	}

	public JugadorCrud(boolean cambio, Jugador j1) {
		super();
		this.cambio = cambio;

	}

	public boolean pasarTurno(Jugador j1) {
		if (cambio == true) {
			cambio = false;
		} else {
			cambio = true;
		}
		return cambio;
	}

}