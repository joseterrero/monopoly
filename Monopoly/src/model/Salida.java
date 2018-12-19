package model;

public class Salida {
	
	private double ingreso;

	public Salida() {
		
	}

	public Salida(double ingreso) {
		this.ingreso = ingreso;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	@Override
	public String toString() {
		return "Salida [ingreso=" + ingreso + "]";
	}
	
	
	
	
	
	

}
