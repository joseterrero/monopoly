package main;

import controller.CasillasController;
import controller.DadoController;
import controller.VistaController;
import datos.CasillasDatos;
import datos.JugadorDatos;
import lecturaporteclado.Leer;
import model.Jugador;
import vista.Tablero;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int posicion = 1, posicioni = 0, posicionj = 0, player1 = 1, player2 = 2, turno = 0, numLeer = 0,tipo=0;
		boolean p1 = true, p2 = false;
		double dinero = 10000;
		Tablero tab = new Tablero();
		JugadorDatos jugDat = new JugadorDatos();
		DadoController dadoCont = new DadoController();
		VistaController vistaCon = new VistaController();
		CasillasController casiCon = new CasillasController();
		CasillasDatos casiDat = new CasillasDatos();
		Jugador j1;
		Jugador j2;

		String tablero[][];

		do {

			tablero = tab.getTablero();

			tab.imprimirNombreJuego();

			System.out.println("Bienvenidos al Monopoly.");

			jugDat.arrayInstrucciones();

			System.out.println("Vamos a crear a los jugadores. ");

			System.out.println("Introduce 3 siglas para el nombre de el jugador 1 : ");
			nombre = Leer.dato();

			j1 = new Jugador(nombre, dinero, posicion, player1, turno, p1);

			System.out.println("Introduce 3 siglas para el nombre de el jugador 2 : ");
			nombre = Leer.dato();

			j2 = new Jugador(nombre, dinero, posicion, player2, turno, p2);

			nombre = j1.getNombre();

			tablero[20][3] = nombre;

			nombre = j2.getNombre();

			tablero[20][14] = nombre;

			for (int i = 0; i < tablero.length; i++) {

				for (int j = 0; j < tablero[i].length; j++) {

					System.out.print(tablero[i][j]);
				}
				System.out.println();
			}

			do {

				if (j1.getCambio() == true) {

					if (j1.getTurno() == 1 || j1.getTurno() == 4) {

						j1.toString();

						j1.setTurno(0);

						posicion = j1.getPosicion();

						posicioni = vistaCon.mirarPocip1i(tab.getPosiciop1i(), posicion);

						posicionj = vistaCon.mirarPocip1j(tab.getPosiciop1j(), posicion);

						vistaCon.modifiTableBlanco(tablero, posicioni, posicionj);

						posicion = posicion + dadoCont.tirarDado();

						if (posicion > 24) {
							posicion = posicion - 24;
						}

						j1.setPosicion(posicion);

					} else {
						j1.setTurno(j1.getTurno() + 1);

						j1.setDinero(j1.getDinero() + 1000);
					}

					posicioni = vistaCon.mirarPocip1i(tab.getPosiciop1i(), posicion);

					posicionj = vistaCon.mirarPocip1j(tab.getPosiciop1j(), posicion);

					vistaCon.modifiTableSiglas(tablero, posicioni, posicionj, nombre);
					
					casiCon.mirarCasilla(casiDat.getCasillas(), posicion-1).getTipo();

				}

				if (j2.getCambio() == true) {

				}

			} while (numLeer != 11 && numLeer != 10);

		} while (numLeer != 10);

	}

}
