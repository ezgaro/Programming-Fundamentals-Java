public class Vehicle {
	private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
	private double fuelConsumption;
	private double fuel;
	private int horsePower;

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public static double getDefaultFuelConsumption() {
		return DEFAULT_FUEL_CONSUMPTION;
	}

	public Vehicle(double fuel, int horsePower) {
		super();
		this.fuel = fuel;
		this.horsePower = horsePower;
		this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
	}
	
	public void drive(double kilometers) {
		double remainingFuel = this.fuel - kilometers * this.fuelConsumption;
		
		if(remainingFuel >= 0) {
			this.setFuel(remainingFuel);
		}
	}

}
