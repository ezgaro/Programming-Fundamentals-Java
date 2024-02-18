import java.text.DecimalFormat;

public class AbstractVehicle implements Vehicle{
	private double fuelQuantity;
	private double fuelConsumption;
	private DecimalFormat decimalFormat;
	
	public AbstractVehicle(double fuelQuantity, double fuelConsumption) {
		super();
		this.fuelQuantity = fuelQuantity;
		this.fuelConsumption = fuelConsumption;
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
		this.fuelQuantity += liters;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f", this.getClass().getSimpleName() , this.fuelQuantity);
	}
	
	
	
}
