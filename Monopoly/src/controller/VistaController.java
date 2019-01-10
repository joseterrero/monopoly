package controller;

public class VistaController {

	public int mirarPocip1i(int posicionp1i[], int posicion) {
		int num = posicion - 1;
		
		return posicionp1i[num];
	}
	
	public int mirarPocip1j(int posicionp1j[], int posicion) {
		int num = posicion - 1;
		
		return posicionp1j[num];
	}
	
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
