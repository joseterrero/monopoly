package vista;

import java.util.Arrays;

public class Tablero {
	//Hacer con array bidimensional, un índice para cada caracter
	private String[] tablero= {"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@      CÁRCEL      @     Barbacana    @      CENTRAL     @      SUERTE      @       Batan      @       Cristo     @     PARKING      @" , 
			"@                  @                  @        DE        @                  @                  @      Soberano    @                  @" , 
			"@        7         @         8        @       TAXIS      @        10        @        11        @       Poder      @       13         @" , 
			"@                  @                  @         9        @                  @                  @         12       @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@  Avd. Finlandia  @                                                                                              @      Navas       @" , 
			"@                  @                                                                                              @                  @" , 
			"@        6         @                                                                                              @       14         @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                                              @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@  Avd. Alemania   @                                                                                              @      PUERTO      @" , 
			"@                  @                                                                                              @                  @" , 
			"@        5         @                                                                                              @       15         @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                                              @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                                              @                  @" ,
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@      BANCA       @                                                                                              @      BANCA       @" , 
			"@                  @                                                                                              @                  @" , 
			"@        4         @                                                                                              @       16         @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                                              @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@      CENTRO      @                                                                                              @   Callemesones   @" , 
			"@     COMERCIAL    @                                                                                              @                  @" , 
			"@                  @                                                                                              @       17         @" , 
			"@        3         @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                                              @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@     Dresde       @                                                                                              @     Peñuelas     @" , 
			"@                  @                                                                                              @                  @" , 
			"@       2          @                                                                                              @       18         @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@                  @                                                                                              @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                  @                  @                  @                  @                  @                  @" ,
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @      Pedro       @      Julio       @      SUERTE      @     ESTACIÓN     @     Joaquín      @      IR A LA     @" , 
			"@      SALIDA      @      Poveda      @      Burel       @                  @        DE        @      Ruano       @      CÁRCEL      @" , 
			"@                  @                  @                  @        22        @       TREN       @       20         @      CÁRCEL      @" , 
			"@        1         @        24        @       23         @                  @        21        @                  @       19         @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@                  @                  @                  @                  @                  @                  @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"};

	public String[] getTablero() {
		return tablero;
	}

	public void setTablero(String[] tablero) {
		this.tablero = tablero;
	}

	@Override
	public String toString() {
		return "Tablero [tablero=" + Arrays.toString(tablero) + "]";
	}

	public Tablero(String[] tablero) {
		this.tablero = tablero;
	}
	
	public void imprimirTablero (String tablero[]) {
		
		for (int i=0;i<tablero.length;i++) {
			
			System.out.println(tablero[i]);
			
		}
		
		
	}
	
	

	
	
	
	
	
	
	
	

}
