package controller;

import crud.CartaCrud;
import datos.CartasDatos;
import model.Carta;
import model.Jugador;

public class CartaController {

	public double ganarDinero(Carta carta, Jugador jug) {		
		carta.getTitulo();
		return jug.getDinero()+carta.getCantidad();
	}

	public double perderDinero(Carta carta, Jugador jug) {
		carta.getTitulo();
		return jug.getDinero()-carta.getCantidad();
	}

	public void sacarCartaBanca(CartaCrud carCrud, CartasDatos carDat,Jugador jug) {
		int num;

		num = carCrud.sacarCartaSorpresa();

		if (carDat.getBanca()[num].getAccion() == 1) {
			perderDinero(carDat.getBanca()[num], jug);
		} else {
			ganarDinero(carDat.getBanca()[num], jug);
		}

	}

	public void sacarCartaSorpresa(CartaCrud carCrud, CartasDatos carDat,Jugador jug) {
		int num;

		num = carCrud.sacarCartaSorpresa();

		if (carDat.getSorpresa()[num].getAccion() == 1) {
			perderDinero(carDat.getBanca()[num], jug);
		} else {
			ganarDinero(carDat.getBanca()[num], jug);
		}

	}

}
