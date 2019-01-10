package datos;

import model.Calle;
import model.Carcel;
import model.Carta;
import model.Casilla;
import model.Estacion;
import model.Ircarcel;
import model.Parking;
import model.Salida;

public class CasillasDatos {

	public CasillasDatos() {
		
	}
	
	
	Salida casilla1 = new Salida(1000);
	Calle casilla2 = new Calle("Dresde",600,230);
	Estacion casilla3 = new Estacion("Centro comercial",1000,500);
	Carta casilla4 = new Carta(1);
	Calle casilla5 = new Calle("Avd. Alemania",750,300);
	Calle casilla6 = new Calle("Avd. Finlandia",900,400);
	Carcel casilla7 = new Carcel();
	Calle casilla8 = new Calle("Barbacana",680,250);
	Estacion casilla9 = new Estacion("Cental de taxis",1000,500);
	Carta casilla10 = new Carta(2);
	Calle casilla11 = new Calle("Batan",800,290);
	Calle casilla12 = new Calle("Cristo Soberano Poder", 950,420);
	Parking casilla13 = new Parking(0);
	Calle casilla14 = new Calle("Navas",730,290);
	Estacion casilla15 = new Estacion("Puerto",1000,500);
	Carta casilla16 = new Carta(1);
	Calle casilla17 = new Calle("Callemesones",840,320);
	Calle casilla18 = new Calle("Peñuelas",1000,480);
	Ircarcel casilla19 = new Ircarcel();
	Calle casilla20 = new Calle("Juaquín Ruano",800,400);
	Estacion casilla21 = new Estacion("Estación de Tren",1000,500);
	Carta casilla22 = new Carta(2);
	Calle casilla23 = new Calle("Julio Burel",950,430);
	Calle casilla24 = new Calle("Pedro Poveda",1200,580);
	
	// arrays de las casillas.
	
	private Calle casillasCalle[] = {casilla2,casilla5,casilla6,casilla8,casilla11,casilla12,casilla14,
			casilla17,casilla18,casilla20,casilla23,casilla24};
	
	private Carta casillasCarta[] = {casilla4,casilla10,casilla16,casilla22};
	
	private Estacion casillasEstacion[] = {casilla3,casilla9,casilla15,casilla21};
	
	private Salida casillasSalida[] = {casilla1};
	
	private Carcel casillasCarcel[] = {casilla7};
	
	private Parking casillasParking[] = {casilla13};
	
	private Ircarcel casillasIrcarcel[] = {casilla19};
	
	//tipos; 1 = Calles, 2 = Cartas, 3 = Estacion, 4 = Salida, 5 =  Carcel, 6 = Parking, 7 = Ircarcel.
	
	Casilla c1 = new Casilla(4,0);
	Casilla c2 = new Casilla(1,0);
	Casilla c3 = new Casilla(3,0);
	Casilla c4 = new Casilla(2,0);
	Casilla c5 = new Casilla(1,1);
	Casilla c6 = new Casilla(1,2);
	Casilla c7 = new Casilla(5,0);
	Casilla c8 = new Casilla(1,3);
	Casilla c9 = new Casilla(3,1);
	Casilla c10 = new Casilla(2,1);
	Casilla c11 = new Casilla(1,4);
	Casilla c12 = new Casilla(1,5);
	Casilla c13 = new Casilla(6,0);
	Casilla c14 = new Casilla(1,6);
	Casilla c15 = new Casilla(3,2);
	Casilla c16 = new Casilla(2,2);
	Casilla c17 = new Casilla(1,7);
	Casilla c18 = new Casilla(1,8);
	Casilla c19 = new Casilla(7,0);
	Casilla c20 = new Casilla(1,9);
	Casilla c21 = new Casilla(3,3);
	Casilla c22 = new Casilla(2,3);
	Casilla c23 = new Casilla(1,10);
	Casilla c24 = new Casilla(1,11);
	
	private Casilla casillas[] = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24};

	
	public Calle[] getCasillasCalle() {
		return casillasCalle;
	}


	public Carta[] getCasillasCarta() {
		return casillasCarta;
	}


	public Estacion[] getCasillasEstacion() {
		return casillasEstacion;
	}


	public Salida[] getCasillasSalida() {
		return casillasSalida;
	}


	public Carcel[] getCasillasCarcel() {
		return casillasCarcel;
	}


	public Parking[] getCasillasParking() {
		return casillasParking;
	}


	public Ircarcel[] getCasillasIrcarcel() {
		return casillasIrcarcel;
	}


	public Casilla[] getCasillas() {
		return casillas;
	}
	
	}
	
