package datos;

public class JugadorDatos {

	public JugadorDatos() {

	}

	public String[] arrayCartasBanca() {
		String[] banca = { "Has donado dinero para la educación de los jóvenes, paga 100 $ al banco.",
				"Compras juguetes para los niños pobres en navidad, pagas 25 $.",
				"Servicio de cirugía plástica, paga 50 $.",
				"Has sido multado por construcciones inseguras, pagas 50 $.", "Impuesto de gas, paga 25 $ al banco.",
				"Deudas entre amigos, pagas 25 $ a cada jugador.",
				"Gastos en electrodomésticos, pagas 25 $ a cada jugador.", "Multa de tránsito, pagas 50 $.",
				"Te encontraron robando a tus compañeros, pagas 15 $ a cada uno.", "Necesitas un coche, pagas 150 $." };
		return banca;
	}

	public String[] arrayCartasSorpresa() {
		String[] sorpresa = { "Error del banco a tu favor, cobra 200 $.", "Tu abuelo murió, heredas 300 $.",
				"Te presentas a gobernador, cobras 50 $.", "Avanza hasta la salida, cobras 200 $.",
				"Tus construcciones están mejorando, cobra 100 $ del banco.",
				"Error de cálculos, el banco te devuelve 50 $.", "Reparto de dividendos, cobras 150 $.",
				"Has ganado un concurso de sopas de letras, cobras 25 $.",
				"Revendes entradas de concierto, ganas 50 $.", "Te encuentras una cartera, ganas 25 $." };

		return sorpresa;
	}

	public String[] arrayInstrucciones() {
		String[] instrucciones = {
				"  ___                 _                                  _                              \r\n"
						+ " |_ _|  _ __    ___  | |_   _ __   _   _    ___    ___  (_)   ___    _ __     ___   ___ \r\n"
						+ "  | |  | '_ \\  / __| | __| | '__| | | | |  / __|  / __| | |  / _ \\  | '_ \\   / _ \\ / __|\r\n"
						+ "  | |  | | | | \\__ \\ | |_  | |    | |_| | | (__  | (__  | | | (_) | | | | | |  __/ \\__ \\\r\n"
						+ " |___| |_| |_| |___/  \\__| |_|     \\__,_|  \\___|  \\___| |_|  \\___/  |_| |_|  \\___| |___/",

				"El principal objetivo de este juego es ser el último que"
						+ "quede en la partida, sin estar en bancarrota.",
				"Cada vez que pases por la casilla de salida la banca" + "te dará 200€",
				"Cada vez que alguien caiga en una casilla que tu tengas "
						+ "comprada tendrá que pagar el importe que posea esa calle"
						+ "y este se sumará al dinero del poseedor",
				"Si caes en una de las casillas de estacion y eres el primer"
						+ "jugador que cae en ella tendrás la oportunidad de comprarla"
						+ "Si caes en una de las casilla de suerte o banca deberás de "
						+ "obedecer lo que la carta diga",
				"Si caes en la casilla del parking te quedarás ahi hasta tu proximo"
						+ "turno y se sumará a tu dinero lo que haya en el bote de la banca",
				"Hay dos maneras de ir a la carcel, la primera es caer en la casilla"
						+ "de cárcel o que te toque en una carta la orden de ir a la carcel",
				"Para salir de la cárcel puedes pagar un impuesto de 50€",
				"El último jugador que quede en la partida gana el juego." };

		return instrucciones;

	}
}
