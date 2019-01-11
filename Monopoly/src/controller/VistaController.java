package controller;

import model.Jugador;
import vista.Tablero;

public class VistaController {
	
	Tablero t1= new Tablero ();
	Jugador j1=new Jugador();
	Jugador j2=new Jugador ();

	public VistaController() {
		
	}

	public int mirarPocip1i(int posicionp1i[], int posicion) {
		int num = posicion - 1;
		
		return posicionp1i[num];
	}
	
	public int mirarPocip1j(int posicionp1j[], int posicion) {
		int num = posicion - 1;
		
		return posicionp1j[num];
	}
	
//	public void moverJ1(int posicion) {
		
//		mirarPocip1i(t1.getPosiciop1i(), posicion);
//		mirarPocip1j(t1.getPosiciop1j(), posicion);
//		t1.getTablero()[t1.getPosiciop1j()[posicion]] [t1.getPosiciop1j()[posicion]] = j1.getNombre();
	//	t1.getTablero()[] []
		
//		return tablero [posiciop1i [posicion]] [posiciop1j [posicion]] = j1.getNombre();
		
		
		
		
		
//	}
	
	
	public int mirarPocip2i(int posicionp2i[], int posicion) {
		int num = posicion - 1;
		
		return posicionp2i[num];
	}
	
	public int mirarPocip2j(int posicionp2j[], int posicion) {
		int num = posicion - 1;
		
		return posicionp2j[num];
	}
	
	public String[][] modifiTableBlanco(String Tablero[][],int posicioni,int posicionj) {
		Tablero[posicioni][posicionj] = "   ";
		
		return Tablero;
	}
	
	public String[][] modifiTableSiglas(String Tablero[][],int posicioni,int posicionj,String nombre) {
		Tablero[posicioni][posicionj] = nombre;
		
		return Tablero;
	}
	
	
}
