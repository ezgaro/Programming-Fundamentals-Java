public class RaceMotorcycle extends MotorCycle{
	private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;


	public RaceMotorcycle(double fuel, int horsePower) {
		super(fuel, horsePower);
		super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
	}

}
