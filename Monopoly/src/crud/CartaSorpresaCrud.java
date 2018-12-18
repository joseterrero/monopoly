package crud;

import java.util.Random;

import model.Jugador;
import model.Parking;

public class CartaSorpresaCrud {

	public int sacarCartaSorpresa() {
		int num = 0, hasta = 10, desde = 1;
		Random r = new Random(System.nanoTime());

		num = r.nextInt(hasta - desde + desde) + desde;

		return num;
	}

	public void carta0(Jugador j) {
		j.setDinero(j.getDinero() + 1000);

	}

	public void carta1(Jugador j) {
		j.setDinero(j.getDinero() + 1500);
	}

	public void casta2(Jugador j) {
		j.setDinero(j.getDinero() + 500);
	}

	public void carta3(Jugador j) {

	}

	public void carta4(Jugador j) {
		j.setDinero(j.getDinero() + 500);
	}

	public void carta5(Jugador j, Parking p) {
		j.setDinero(j.getDinero() - 500);
		p.setBote(p.getBote() + 500);
	}

	public void carta6(Jugador j) {
		j.setDinero(j.getDinero() + 350);
	}

	public void carta7(Jugador j, Parking p) {
		j.setDinero(j.getDinero() - 250);
		p.setBote(p.getBote() + 250);
	}

	public void carta8(Jugador j, Parking p) {
		j.setDinero(j.getDinero() - 450);
		p.setBote(p.getBote() + 450);
	}

	public void carta9(Jugador j, Parking p) {
		j.setDinero(j.getDinero() - 1000);
		p.setBote(p.getBote() + 1000);
	}
}
