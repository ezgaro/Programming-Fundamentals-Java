import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tokens = scanner.nextLine().split("\\s+");
		Vehicle vehicle1 = new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3]));

		tokens = scanner.nextLine().split("\\s+");
		Vehicle vehicle2 = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3]));

		tokens = scanner.nextLine().split("\\s+");
		Vehicle vehicle3 = new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3]));

		Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
		vehicleMap.put("Car", vehicle1);
		vehicleMap.put("Truck", vehicle2);
		vehicleMap.put("Bus", vehicle3);

		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			tokens = scanner.nextLine().split("\\s+");

			Vehicle vehicle = vehicleMap.get(tokens[1]);
			try {
				switch (tokens[0]) {
				case "Drive":
					if("Bus".equals(vehicle.getClass().getSimpleName())) {
						vehicle.setEmpty(false);
						vehicle.turnOnOffAc(vehicle.isEmpty());
					}
					System.out.println(vehicle.drive(Double.parseDouble(tokens[2])));
					break;
				case "Refuel":
					vehicle.refuel(Double.parseDouble(tokens[2]));
					break;
				case "DriveEmpty":
					vehicle.setEmpty(true);
					vehicle.turnOnOffAc(vehicle.isEmpty());
					System.out.println(vehicle.drive(Double.parseDouble(tokens[2])));
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		vehicleMap.values().forEach(System.out::println);

	}
}

//Car 30 0.04 70
//Truck 100 0.5 300
//Bus 40 0.3 150
//8
//Refuel Car -10
//Refuel Truck 0
//Refuel Car 10
//Refuel Car 300
//Drive Bus 10
//Refuel Bus 1000
//DriveEmpty Bus 100
//Refuel Truck 1000