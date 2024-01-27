public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKilometer;
    private int travelDistance;

    public Car(String model, double fuelCost, double fuelCostPerKilometer) {
        this.model = model;
        this.fuelAmount = fuelCost;
        this.fuelCostPerKilometer = fuelCostPerKilometer;
        this.travelDistance = 0;
    }

    //check whether the car can travel the distance
    public boolean hasSufficientFuel (int kilometers) {
        double neededFuel = getNeededFuel(kilometers);
        return this.fuelAmount >= neededFuel;
    }
    //decrease the fuel
    public void decreaseFuel(int kilometers) {
        double neededFuel = getNeededFuel(kilometers);
        this.fuelAmount -= neededFuel;
    }
    //increase traveled distance
    public void increaseTravelDistance(int kilometers) {
        this.travelDistance += kilometers;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d" , this.model ,this.fuelAmount , this.travelDistance);
    }

    private double getNeededFuel(int kilometers) {
        double neededFuel = this.fuelCostPerKilometer * kilometers;
        return neededFuel;
    }

}
