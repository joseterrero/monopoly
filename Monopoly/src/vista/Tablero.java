package vista;

import java.util.Arrays;
import model.Jugador;

public class Tablero {
	//Preguntar a Ángel si simplifico tambien las filas donde van las siglas de los jugadores, habría que cambiar los indices de posiciones[][]
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
			{"@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," "," ","   "," ","@"," ","   "," "," "," "," "," "," "," "," "," ","   "," ","@"} , 
			{"@                  @                  @                  @                 @                  @                  @                 @"} ,
			{"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"} };
	
	
		private String[][] posiciones= {{tablero[82][3],tablero[71][3],tablero[59][3],tablero[47][3],tablero[35][3],tablero[23][3],tablero[10][3],tablero[10][18],tablero[10][33],tablero[10][48],tablero[10][62],tablero[10][77],tablero[10][92],tablero[23][112],tablero[23][112],tablero[35][112],tablero[47][112],tablero[59][112],tablero[71][112],tablero[82][92],tablero[82][77],tablero[82][62],tablero[82][48],tablero[82][33],tablero[82][18]},
			
			
			{tablero[82][14],tablero[71][14],tablero[59][14],tablero[47][14],tablero[35][14],tablero[23][14],tablero[10][14],tablero[10][29],tablero[10][44],tablero[10][58],tablero[10][73],tablero[10][88],tablero[10][102],tablero[23][122],tablero[35][122],tablero[47][122],tablero[59][122],tablero[71][122],tablero[82][102]}
			};	
	
	

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
				
				for(int j=0;j<tablero.length;j++) {
					
					System.out.println(tablero[i][j]);
				}
				
			}
		
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
			
	public void moverFicha(int posicion, int posicionAnterior, int numJugador) {
			posiciones /* setPosicion(int posicion) */[getPlayer()-1] [getPosicion() /*getPosicion()*/ -1] = /*siglas jugador*/ getNombre() ;
			
			posiciones /*  setPosicion(int posicion)*/  [/*numJugador*/ getPlayer()  -1]  [/*posicionAnterior*/ getPosicionAnterior()  -1] = /*siglas jugador*/ getNombre() ;
			}
		
		
	}
	
	

	
	
	
	
	
	
	
	

}
