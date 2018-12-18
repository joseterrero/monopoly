package datos;

import model.Carta;

public class CartasDatos {

	public CartasDatos() {

	}
	// accion 1 es restar y accion 2 es sumar

	Carta c1 = new Carta("Banca","Has donado dinero para la educación de los jóvenes, pagas 600 $.", 600, 1);
	Carta c2 = new Carta("Banca","Compras juguetes para los niños pobres en navidad, pagas 350 $.",300,1);
	Carta c3 = new Carta("Banca","Servicio de cirugía plástica, paga 500 $.",500,1);
	Carta c4 = new Carta("Banca","Has sido multado por construcciones inseguras, pagas 1000 $.",1000,1);
	Carta c5 = new Carta("Banca","Impuesto de gas, paga 400 $ al banco.",400,1);
	Carta c6 = new Carta("Banca","Deudas entre amigos, cobras 500 $ ",500,2);
	Carta c7 = new Carta("Banca","Gastos en electrodomésticos, pagas 320 $.",320,1);
	Carta c8 = new Carta("Banca","Ganacias de inversión, ganas 950 $.",950,2);
	Carta c9 = new Carta("Banca","Por cliente fiel el banco te premia con 250 $.",250,2);
	Carta c10 = new Carta("Banca","Vendes un coche, ganas 750 $.",750,2);
	
	Carta banca[]= {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
	
	Carta c11 = new Carta("Sorpresa","Error del banco a tu favor, cobra 1000 $.",1000,2);
	Carta c12 = new Carta("Sorpresa","Tu abuelo murió, heredas 1500 $.",1500,2);
	Carta c13 = new Carta("Sorpresa","Te presentas a gobernador, cobras 700 $.",700,2);
	Carta c14 = new Carta("Sorpresa","Avanza hasta la salida, cobras 1000 $.",1000,2);
	Carta c15 = new Carta("Sorpresa","Tus construcciones están mejorando, cobra 500 $ del banco.",500,2);
	Carta c16 = new Carta("Sorpresa","Error de cálculos, pierdes 500 $.",500,1);
	Carta c17 = new Carta("Sorpresa","Error de dividendos, pierdes 350 $.",350,1);
	Carta c18 = new Carta("Sorpresa","Has perdido un concurso de sopas de letras, pagas 450 $.",450,1);
	Carta c19 = new Carta("Sorpresa","Compras entradas de concierto, pagas 250 $.",250,1);
	Carta c20 = new Carta("Sorpresa","Pierdes la cartera, pierdes 1000 $.",1000,1);
	
	Carta sorpresa[]= {c11,c12,c13,c14,c15,c16,c17,c18,c19,c20};

	

}
