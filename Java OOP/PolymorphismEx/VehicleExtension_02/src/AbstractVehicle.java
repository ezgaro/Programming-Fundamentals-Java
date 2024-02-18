import java.text.DecimalFormat;

public class AbstractVehicle implements Vehicle{
	private double fuelQuantity;
	private double fuelConsumption;
	private double tankCapacity;
	private DecimalFormat decimalFormat;
	
	public AbstractVehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
		super();
		this.fuelQuantity = fuelQuantity;
		this.fuelConsumption = fuelConsumption;
		this.tankCapacity = tankCapacity;
		this.decimalFormat = new DecimalFormat("#.##");
	}

	
	@Override
	public String drive(double distance) {
		double neededFuel = this.fuelConsumption * distance;
		
		if (neededFuel > this.fuelQuantity) {
			this.fuelQuantity -= neededFuel;
			return String.format("%s travelled %s km}",
					getClass().getSimpleName(), decimalFormat.format(distance));
		}
		return String.format("%s needs refueling", getClass().getSimpleName());
	}

	@Override
	public void refuel(double liters) {
		if(liters <= 0) {
			//We will catch this exception in the main method
			throw new IllegalArgumentException("Fuel must be a positove number");
		}
		
		if(this.fuelQuantity + liters > this.tankCapacity) {
			throw new IllegalArgumentException("Cannot fit fuel in tank");
		}
		this.fuelQuantity += liters;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f", this.getClass().getSimpleName() , this.fuelQuantity);
	}

	@Override
	public double getFuelConsumption() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setFuelConsumption(double fuelConsumption) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
