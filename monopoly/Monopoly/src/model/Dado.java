package model;

public class Dado {
	
	private int numero;
	
	public Dado() {
		
	}

	public Dado(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Dado [numero=" + numero + "]";
	}
	
}
