package test;

import controller.DadoController;
import datos.JugadorDatos;
import lecturaporteclado.Leer;
import model.Jugador;
import vista.Tablero;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int tam = 2, posicion = 1, player = 1, posAnterior = 0;
		double dinero = 10000;
		// Tablero tab = new Tablero();
		JugadorDatos jugDat = new JugadorDatos();
		Tablero t = new Tablero();
		DadoController dadoCont = new DadoController();

		Jugador[] listaJugadores = new Jugador[tam];

		// tab.imprimirNombreJuego();

		System.out.println("Bienvenidos al Monopoly.");

		jugDat.arrayInstrucciones();

		System.out.println("Vamos a crear a los jugadores. ");

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Introduce el nombre del jugador " + (i + 1) + ": ");
			nombre = Leer.dato();

			listaJugadores[i] = new Jugador(nombre, dinero, posicion, player, posAnterior); // Creo que si los datos se
																							// los vamos a pasar luego
																							// de çbemos crear los
																							// jugadores vacios y luego
																							// se rellenan
			player++;
		}

		/*
		 * for (int i = 0; i < listaJugadores.length; i++) {
		 * System.out.println("Jugador " + (i + 1) + " - " + listaJugadores[i]); }
		 */
		
		// t.imprimirTablero(tablero);

		t.getTablero();

		System.out.println("Va a empezar el Jugador 1.");

		System.out.println("Ha salido un " + dadoCont.tirarDado() + " del dado.");

	}

}
