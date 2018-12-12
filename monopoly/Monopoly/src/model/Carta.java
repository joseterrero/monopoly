package model;

public class Carta {
	
	private String suerte;
	private String carcel;
	
	public Carta() {
		
	}

	public Carta(String suerte, String carcel) {
		super();
		this.suerte = suerte;
		this.carcel = carcel;
	}

	public String getSuerte() {
		return suerte;
	}

	public void setSuerte(String suerte) {
		this.suerte = suerte;
	}

	public String getCarcel() {
		return carcel;
	}

	public void setCarcel(String carcel) {
		this.carcel = carcel;
	}

	@Override
	public String toString() {
		return "Carta [suerte=" + suerte + ", carcel=" + carcel + "]";
	}
	
}
