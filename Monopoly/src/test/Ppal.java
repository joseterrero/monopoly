package test;

import lecturaporteclado.Leer;
import model.Jugador;
import vista.Tablero;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int tam = 2, posicion = 1, player=1;
		double dinero = 10000;
		Tablero tab = new Tablero();

		Jugador[] listaJugadores = new Jugador[tam];

		tab.imprimirNombreJuego();

		System.out.println("Bienvenidos al Monopoly.");

		System.out.println("Vamos a crear a los jugadores. ");

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Introduce el nombre del jugador: ");
			nombre = Leer.dato();
			
			listaJugadores[i] = new Jugador(nombre, dinero, posicion, player);
		}

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Jugador " + (i + 1) + " - " + listaJugadores[i]);
		}

	}

}
