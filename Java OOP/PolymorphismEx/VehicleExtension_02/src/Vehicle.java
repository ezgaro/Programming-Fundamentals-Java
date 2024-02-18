public interface Vehicle {
	String drive(double distance);
	void refuel(double liters);
	void setFuelConsumption(double fuelConsumption);
	double getFuelConsumption();
	default void turnOnOffAc(boolean isEmpty) {
		
	};
	
	default boolean isEmpty() {
		return true;
	}
	default void setEmpty(boolean empty) {
		
	};
}
