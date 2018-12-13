package test;

import lecturaporteclado.Leer;
import model.Jugador;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int tam, posicion = 1;
		double dinero = 10000;

		Jugador[] listaJugadores;

		System.out.println("Bienvenidos al Monopoly.");

		System.out.println("¿Cuántos jugadores van a jugar?");
		tam = Leer.datoInt();

		listaJugadores = new Jugador[tam];

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println("Introduzca el nombre: ");
			nombre = Leer.dato();
			
			listaJugadores[i] = new Jugador(nombre, dinero, posicion);
		}

	}

}
