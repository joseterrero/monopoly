package datos;

public class CartasDatos {

	public CartasDatos() {
		
	}
	
	public String[] tipoCarta(){
		String[] tipo= {"Banca.","Sorpresa."};
		
		return tipo;
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
		String [] sorpresa= {"Error del banco a tu favor, cobra 1000 $.",
				"Tu abuelo murió, heredas 1500 $.",
				"Te presentas a gobernador, cobras 1000 $.",
				"Avanza hasta la salida, cobras 200 $.",
				"Tus construcciones están mejorando, cobra 500 $ del banco.",
				"Error de cálculos, pierdes 500 $.",
				"Reparto de dividendos, cobras 350 $.",
				"Has perdido un concurso de sopas de letras, pagas 250 $.",
				"Compras entradas de concierto, pierdes 450 $.",
				"Pierdes la cartera, pierdes 1000 $."};
		
		return sorpresa;
	}
	

}
