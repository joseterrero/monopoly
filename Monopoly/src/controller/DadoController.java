package controller;

import java.util.Random;

public class DadoController {

	public DadoController() {
		
	}
	
	public int tirarDado() {
		int num=0, desde=1, hasta=6;
		Random r= new Random (System.nanoTime());
		
		num= r.nextInt(hasta-desde+desde)+desde;
		
		return num;
	}
	

}
