package controller;

import java.util.Random;

public class DadoController {

	public DadoController() {
		
	}
	
	public int tirarDado() {
		int num=0;
		Random r= new Random (System.nanoTime());
		
		num= r.nextInt(6-1+1)+1;
		
		return num;
	}
	

}
