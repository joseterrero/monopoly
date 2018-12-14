package test;

import lecturaporteclado.Leer;
import model.Jugador;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, color;
		int tam = 2, posicion = 1;
		double dinero = 10000;

		Jugador[] listaJugadores = new Jugador[tam];

		System.out.println("Bienvenidos al Monopoly.");

		System.out.println("Vamos a crear a los jugadores. ");

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Introduce el nombre del jugador: ");
			nombre = Leer.dato();

			System.out.println((i+1)+". Rojo.");
			System.out.println((i+2)+". Azul.");
			System.out.println("Elige el color: ");
			color = Leer.dato();

			listaJugadores[i] = new Jugador(nombre, dinero, posicion, color);
		}

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Jugador " + (i + 1) + " - " + listaJugadores[i]);
		}

	}

}
