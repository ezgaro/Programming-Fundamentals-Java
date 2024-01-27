import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String , Car> cars = new HashMap<>();
        while(n-- >0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostPerKm = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            cars.putIfAbsent(model , car);
        }

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String carModel = tokens[1];
            int kilometers = Integer.parseInt(tokens[2]);

            Car car = cars.get(carModel);
            if(car.hasSufficientFuel(kilometers)) {
                car.decreaseFuel(kilometers);
                car.increaseTravelDistance(kilometers);
            } else  {
                System.out.println("Insufficient fuel for the drive");
            }

            line = scanner.nextLine();
        }

        cars.values().forEach(System.out::println);
    }
}