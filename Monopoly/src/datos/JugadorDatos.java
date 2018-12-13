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

}
