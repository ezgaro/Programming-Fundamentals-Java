public class Car extends Vehicle{
	
	private static final double DEFAULT_FUEL_CONSUMPTION = 8.0;


	public Car(double fuel, int horsePower) {
		super(fuel, horsePower);
		super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
	}

}
