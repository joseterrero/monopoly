package crud;

import controller.DadoController;

public class CarcelCrud {
	
	private int turnos=0;
	private String salida="Libertaaad!";
	private DadoController d;
	private int tirada=0;
	
	
	

	public CarcelCrud(DadoController d) {
		super();
		this.d = d;
	}


	public String estarEncarcelado() {
		
		do {
			System.out.println("Estás encarcelado no puedes salir, podrás salir cuando lleves tres turnos en la cárcel.");
			turnos++;
		} while (turnos!=3);
		
		   return salida;
	}
	
	
	public String salirPorDados() {
		tirada=d.tirarDado();
		
		if (tirada!=6) {
			System.out.println("Sigues encarcelado");
		}
		return salida;
	}
	
	
	
}
