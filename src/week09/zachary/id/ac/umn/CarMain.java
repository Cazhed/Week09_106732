package week09.zachary.id.ac.umn;

public class CarMain {
	
	public static void main(String[] args) {
		Car myCar = new Car("Honda Civic");
		
		myCar.showVehicleInfo();
		
		myCar.start();
		
		myCar.stop();
	}
}
