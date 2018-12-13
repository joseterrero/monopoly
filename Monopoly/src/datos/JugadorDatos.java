package datos;


public class JugadorDatos {

	public JugadorDatos() {
		
	}
	
	public String[] arrayCartasBanca() {
		String [] banca= {"Has donado dinero para la educación de los jóvenes, paga 100 $ al banco.",
				"Compras juguetes para los niños pobres en navidad, pagas 25 $.",
				"Servicio de cirugía plástica, paga 50 $.",
				"Has sido multado por construcciones inseguras, pagas 50 $.",
				"Impuesto de gas, paga 25 $ al banco.",
				"Deudas entre amigos, pagas 25 $ a cada jugador.",
				"Gastos en electrodomésticos, pagas 25 $ a cada jugador.",
				"Multa de tránsito, pagas 50 $.",
				"Te encontraron robando a tus compañeros, pagas 15 $ a cada uno.",
				"Necesitas un coche, pagas 150 $."};
		return banca;
	}
	
	public String[] arrayCartasSorpresa() {
		String [] sorpresa= {"Error del banco a tu favor, cobra 200 $.",
				"Tu abuelo murió, heredas 300 $.",
				"Te presentas a gobernador, cobras 50 $.",
				"Avanza hasta la salida, cobras 200 $.",
				"Tus construcciones están mejorando, cobra 100 $ del banco.",
				"Error de cálculos, el banco te devuelve 50 $.",
				"Reparto de dividendos, cobras 150 $.",
				"Has ganado un concurso de sopas de letras, cobras 25 $.",
				"Revendes entradas de concierto, ganas 50 $.",
				"Te encuentras una cartera, ganas 25 $."};
		
		return sorpresa;
	}
	
	public String[] arrayInstrucciones() {
		String [] instrucciones= {
				"  ___                 _                                  _                              \r\n" + 
				" |_ _|  _ __    ___  | |_   _ __   _   _    ___    ___  (_)   ___    _ __     ___   ___ \r\n" + 
				"  | |  | '_ \\  / __| | __| | '__| | | | |  / __|  / __| | |  / _ \\  | '_ \\   / _ \\ / __|\r\n" + 
				"  | |  | | | | \\__ \\ | |_  | |    | |_| | | (__  | (__  | | | (_) | | | | | |  __/ \\__ \\\r\n" + 
				" |___| |_| |_| |___/  \\__| |_|     \\__,_|  \\___|  \\___| |_|  \\___/  |_| |_|  \\___| |___/", 
				"El primer objetivo del juego es ser el último que quede en la partida y que no esté en bancarrota.",
				"Casillas de suerte o banca: cuando caigas en una de las casillas de carta ya sea suerte o banca, deberas de seguir las instruccines de la carta"
				+ ""
		
		
		
		
		
		};
		
		return instrucciones;
	
	}
}
