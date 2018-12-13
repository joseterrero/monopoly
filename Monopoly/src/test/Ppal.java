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

		do {
		System.out.println("¿Cuántos jugadores van a jugar? 1-4");
		tam = Leer.datoInt();
		
		if (tam>1 && tam<=4) {
			
			listaJugadores = new Jugador[tam];

			for (int i = 0; i < listaJugadores.length; i++) {
				System.out.println("Introduzca el nombre: ");
				nombre = Leer.dato();
				
				listaJugadores[i] = new Jugador(nombre, dinero, posicion);
			}
			
		} else {
			System.out.println("Error. El número de jugadores indicados no es válido. Vuelva a intentarlo.");
		}

		}while(tam!=1 && tam!=2 && tam!=3 && tam!=4);

	}

}
