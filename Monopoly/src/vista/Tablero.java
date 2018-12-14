package vista;

import java.util.Arrays;

public class Tablero {
	
	private String[] tablero= {"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @            @              @                 @             @             @                  @" , 
			"@                  @            @              @                 @             @   Cristo    @                  @" , 
			"@                  @            @   CENTRAL    @                 @             @             @                  @" , 
			"@                  @            @              @                 @             @    del      @                  @" , 
			"@      CÁRCEL      @ Barbacana  @     DE       @     SUERTE      @    Batan    @             @     PARKING      @" , 
			"@                  @            @    TAXIS     @                 @             @  Soberano   @                  @" , 
			"@                  @            @              @                 @             @             @                  @" , 
			"@        7         @     8      @      9       @       10        @     11      @    Poder    @       13         @" , 
			"@                  @            @              @                 @             @             @                  @" , 
			"@                  @            @              @                 @             @     12      @                  @" , 
			"@                  @            @              @                 @             @             @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@  Avd. Finlandia  @                                                                         @      Navas       @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @       14         @" , 
			"@        6         @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @@@@@@@@@@@@@@@@@@@@" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@  Avd. Alemania   @                                                                         @      PUERTO      @" , 
			"@                  @                                                                         @                  @" , 
			"@        5         @                                                                         @       15         @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                         @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@   4  BANCA       @                                                                         @      BANCA       @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @       16         @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                         @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@   3  CENTRO      @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@     COMERCIAL    @                                                                         @   Callemesones   @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @       17         @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@                                                                         @                  @" , 
			"@                  @                                                                         @@@@@@@@@@@@@@@@@@@@" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@   2 Dresde       @                                                                         @                  @" , 
			"@                  @                                                                         @     Peñuelas     @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @       18         @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@                  @                                                                         @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" , 
			"@                  @            @              @                @              @             @                  @" ,
			"@                  @            @              @                @              @             @                  @" , 
			"@                  @            @              @                @              @             @                  @" , 
			"@                  @            @              @                @   ESTACIÓN   @             @                  @" , 
			"@                  @   Pedro    @   Julio      @                @              @   Joaquín   @     IR A LA      @" , 
			"@    1  SALIDA     @            @              @     SUERTE     @      DE      @             @                  @" , 
			"@                  @   Poveda   @   Burel      @                @              @    Ruano    @     CÁRCEL       @" , 
			"@                  @            @              @                @     TREN     @             @                  @" , 
			"@                  @    24      @      23      @       22       @              @     20      @       19         @" , 
			"@                  @            @              @                @     21       @             @                  @" , 
			"@                  @            @              @                @              @             @                  @" , 
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"};

	public Tablero() {
		
	}
	
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
	
	public void imprimirTablero (String tablero[]) {
		
		for (int i=0;i<tablero.length;i++) {
			
			System.out.println(tablero[i]);
			
		}
		
		
	}
	
	

	
	
	
	
	
	
	
	

}
