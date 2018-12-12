package model;

public class Carcel {
	
	private int turno;
	private Dado dado;
	
	public Carcel() {
		
	}

	public Carcel(int turno, Dado dado) {
		super();
		this.turno = turno;
		this.dado = dado;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Dado getDado() {
		return dado;
	}

	public void setDado(Dado dado) {
		this.dado = dado;
	}

	@Override
	public String toString() {
		return "Carcel [turno=" + turno + ", dado=" + dado + "]";
	}
	
}
