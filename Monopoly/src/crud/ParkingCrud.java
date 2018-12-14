package crud;

public class ParkingCrud {

	private double bote=0;
	
	
	
	public ParkingCrud(double dinero) {
		
	}


	public double sumarBote(double dinero) {
		bote=dinero+bote;
		return bote;
		
	}
	
	public void resetearBote() {
		bote=0;
	}
	
	
}
