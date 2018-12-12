package model;

public class Parking {
	
	private double bote;
	
	public Parking() {
		
	}

	public Parking(double bote) {
		super();
		this.bote = bote;
	}

	public double getBote() {
		return bote;
	}

	public void setBote(double bote) {
		this.bote = bote;
	}

	@Override
	public String toString() {
		return "Parking [bote=" + bote + "]";
	}
	
}
