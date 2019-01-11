package vista;

import java.util.Arrays;
import model.Jugador;

public class Tablero {
	//Preguntar a Ángel si simplifico tambien las filas donde van las siglas de los jugadores, habría que cambiar los indices de posiciones[][]
	
	
	Jugador j1=new Jugador();
	Jugador j2=new Jugador();
	
	
	private String[][] tablero= {{"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@      CÁRCEL      @     Barbacana    @      CENTRAL     @     SUERTE      @       Batan      @       Cristo     @     PARKING     @"} , 
			{"@                  @                  @        DE        @                 @                  @      Soberano    @                 @"} , 
			{"@        7         @         8        @       TAXIS      @      10         @        11        @       Poder      @       13        @"} , 
			{"@                  @                  @         9        @                 @                  @         12       @                 @"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@  Avd. Finlandia  @                                                                                             @      Navas      @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@        6         @                                                                                             @       14        @"} , 
			{"@                  @                                                                                             @                 @"} ,  
			{"@                  @                                                                                             @                 @"} ,  
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                                                                                             @                 @"} ,  
			{"@@@@@@@@@@@@@@@@@@@@                                                                                             @@@@@@@@@@@@@@@@@@@"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@  Avd. Alemania   @                                                                                             @      PUERTO     @"} , 
			{"@                  @                                                                                             @                 @"} ,  
			{"@        5         @                                                                                             @       15        @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@@@@@@@@@@@@@@@@@@@@                                                                                             @@@@@@@@@@@@@@@@@@@"} ,  
			{"@                  @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@      BANCA       @                                                                                             @      BANCA      @"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@        4         @                                                                                             @       16        @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@@@@@@@@@@@@@@@@@@@@                                                                                             @@@@@@@@@@@@@@@@@@@"} ,
			{"@                  @                                                                                             @                 @"} ,  
			{"@                  @                                                                                             @                 @"} ,  
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} ,  
			{"@      CENTRO      @                                                                                             @   Callemesones  @"} , 
			{"@     COMERCIAL    @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @       17        @"} , 
			{"@        3         @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} ,  
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                                                                                             @                 @"} ,  
			{"@@@@@@@@@@@@@@@@@@@@                                                                                             @@@@@@@@@@@@@@@@@@@"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} ,
			{"@                  @                                                                                             @                 @"} , 
			{"@     Dresde       @                                                                                             @     Peñuelas    @"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@       2          @                                                                                             @      18         @"} , 
			{"@                  @                                                                                             @                 @"} , 
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                                                                                             @                 @"} ,
			{"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"} ,  
			{"@                  @                  @                  @                 @                  @                  @                 @"} ,
			{"@                  @                  @                  @                 @                  @                  @                 @"} ,
			{"@                  @                  @                  @                 @                  @                  @                 @"} ,
			{"@                  @                  @                  @                 @                  @                  @                 @"} , 
			{"@                  @      Pedro       @      Julio       @      SUERTE     @     ESTACIÓN     @     Joaquín      @      IR A LA    @"} , 
			{"@      SALIDA      @      Poveda      @      Burel       @                 @        DE        @      Ruano       @      CÁRCEL     @"} , 
			{"@                  @                  @                  @        22       @       TREN       @       20         @      CÁRCEL     @"} , 
			{"@        1         @        24        @       23         @                 @        21        @                  @       19        @"} , 
			{"@"," ","aaa"," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} ,
			{"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"} };
	
	
		//private String[][] posiciones= {{tablero[82][3],tablero[71][3],tablero[59][3],tablero[47][3],tablero[35][3],tablero[23][3],tablero[10][3],tablero[10][18],tablero[10][33],tablero[10][48],tablero[10][62],tablero[10][77],tablero[10][92],tablero[23][112],tablero[23][112],tablero[35][112],tablero[47][112],tablero[59][112],tablero[71][112],tablero[82][92],tablero[82][77],tablero[82][62],tablero[82][48],tablero[82][33],tablero[82][18]},
		//	
		//	
		//	{tablero[82][14],tablero[71][14],tablero[59][14],tablero[47][14],tablero[35][14],tablero[23][14],tablero[10][14],tablero[10][29],tablero[10][44],tablero[10][58],tablero[10][73],tablero[10][88],tablero[10][102],tablero[23][122],tablero[35][122],tablero[47][122],tablero[59][122],tablero[71][122],tablero[82][102]}
		//	};	
		private int []posiciop1i= {82,71,59,47,35,23,10,10,10,10,10,10,10,23,35,47,59,71,82,82,82,82,82,82};
		private int []posiciop1j={3,3,3,3,3,3,3,18,33,48,62,77,92,112,112,112,112,112,92,77,62,48,33,18};
		private int []posiciop2i= {82,71,59,47,35,23,10,10,10,10,10,10,10,23,35,47,59,71,82,82,82,82,82,82};
		private int []posiciop2j= {14,14,14,14,14,14,14,29,44,58,73,88,102,122,122,12,122,122,102,88,73,58,44,29,};

		public int[] getPosiciop1i() {
			return posiciop1i;
		}

		public void setPosiciop1i(int[] posiciop1i) {
			this.posiciop1i = posiciop1i;
		}

		public int[] getPosiciop1j() {
			return posiciop1j;
		}

		public void setPosiciop1j(int[] posiciop1j) {
			this.posiciop1j = posiciop1j;
		}

		public int[] getPosiciop2i() {
			return posiciop2i;
		}

		public void setPosiciop2i(int[] posiciop2i) {
			this.posiciop2i = posiciop2i;
		}

		public int[] getPosiciop2j() {
			return posiciop2j;
		}

		public void setPosiciop2j(int[] posiciop2j) {
			this.posiciop2j = posiciop2j;
		}

		public void setTablero(String[][] tablero) {
			this.tablero = tablero;
		}

		public Tablero() {
			
		}
		
		public String[][] getTablero() {
			return tablero;
		}
	
	
		@Override
		public String toString() {
			return "Tablero [tablero=" + Arrays.toString(tablero) + "]";
		}
	
		public Tablero(String[][] tablero) {
			this.tablero = tablero;
		}
		
		public void imprimirNombreJuego() {
			System.out.println("                      ``.-``     `      ``     ``--``     ````        ````      ``                  \r\n" + 
					"     `h:       .y`  -shhyshdh/` -mo.    /M/  -sdhssydh/`  mmhhho`  .shhhyhhs-  `my    +d/    sy`    \r\n" + 
					"     -MM+`    /mM- :Ny.    `/Ny -MNmo.  /M/ /Ns`     /Ny  Nh  :Mo /Ns.    .oNo `Ny    `omy-`ym:     \r\n" + 
					"     oMsmy` `sNhMo hN`   `   yM`-Ms:hms./M/ md        yN``Ndoohd-`mh        hN``Ny      .yNhm:      \r\n" + 
					"     hM..dd/dm:.Mh +M/      -dd`-Ms  :ymdM/ oN/      .mh `Ny::-`  ym-      .md `Ny       `mm-       \r\n" + 
					"     mN  `sNs`  mN` /hho//+ydo` -M+    -yN/  /hho//+yho` .Mo      `sds/::/sds. `Nd///// `hm-        \r\n" + 
					"     //    .    ::`  `./++/-`   `/.      -.   `.:++/.`   `:.        `:+oo+:.    /+++++: -+.         \r\n" + 
					"                                                                                                    \r\n" + 
					"");
		}
		
		//imprimirTalbero debe ir en do-while
		public void imprimirTablero (String tablero[][]) {
			
			for (int i=0;i<tablero.length;i++) {
				
				for(int j=0;j<tablero[i].length;j++) {
					
					System.out.print(tablero[i][j]);
				}
				System.out.println();
			}
			
			
		//public String moverJ1 (int []posiciop1i, int []posiciop1j , String [][]tablero) {
			
		//	return tablero [posiciop1i [posicion]] [posiciop1j [posicion]] = j1.getNombre();
			
		//}
		
		//public void borrarJ1 (int []posiciop1i,int []posiciop1j,String [][]tablero) {
			
		//	tablero [posiciop1i [posicion]] [posiciop1j [posicion] ] = "   " ;
			
		//}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		 // Esto sustituye el hueco en blanco reservado por las siglas del jugador
	//	public String avanzarTablero(int posicion,int numJugador) {
			
	//		return posiciones /* setPosicion(int posicion) */[numJugador   /*getPlayer()*/ -1] [posicion /*getPosicion()*/ -1] = siglas jugador /* getNombre() */;
			
	//	}
		
		//Esto sustituye las siglas del jugador  de la casilla de la que se va por tres espacios, vamos que lo deja en blanco
	//	public String borrarPosicion(int posicionAnterior,int numJugador) {
			
	//		return posiciones /*  setPosicion(int posicion)*/  [numJugador /*getPlayer()*/  -1]  [posicionAnterior /*getPosicion()*/  -1] =siglas jugador /* getNombre() */  ;
			
	//	}
		
		
	//	public void moverFicha(int posicion, int posicionAnterior, int numJugador) {
	//		
	//		posiciones /* setPosicion(int posicion) */[getPlayer()-1] [getPosicion() /*getPosicion()*/ -1] = /*siglas jugador*/ getNombre() ;
	//		
	//		posiciones /*  setPosicion(int posicion)*/  [/*numJugador*/ getPlayer()  -1]  [/*posicionAnterior*/ getPosicion()  -1] = /*siglas jugador*/ getNombre() ;
	//	}
			
	//public void moverFicha(int posicion, int posicionAnterior, int numJugador) {
	//		posiciones /* setPosicion(int posicion) */[getPlayer()-1] [getPosicion() /*getPosicion()*/ -1] = /*siglas jugador*/ getNombre() ;
	//		
	//		posiciones /*  setPosicion(int posicion)*/  [/*numJugador*/ getPlayer()  -1]  [/*posicionAnterior*/ getPosicionAnterior()  -1] = /*siglas jugador*/ getNombre() ;
	//		}
		
		
	}
	
	

	
	
	
	
	
	
	
	

}
