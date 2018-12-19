package crud;

import java.util.Random;

import model.Jugador;
import model.Parking;

public class CartaCrud {

	public int sacarCartaSorpresa() {
		int num = 0, hasta = 10, desde = 1;
		Random r = new Random(System.nanoTime());

		num = r.nextInt(hasta - desde + desde) + desde;

		return num;
	}

	
}
