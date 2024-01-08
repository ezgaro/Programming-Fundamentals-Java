import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> cars = new ArrayList<>();
        ArrayList<Vehicle> trucks = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("End")) {
            String[] currentInput = input.split(" ");
            Vehicle vehicle = new Vehicle(currentInput[0], currentInput[1], currentInput[2], Integer.parseInt(currentInput[3]));
            if(vehicle.getType().equals("car")) {
                cars.add(vehicle);
            } else if(vehicle.getType().equals("truck")) {
                trucks.add(vehicle);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while(!input.equals("Close the Catalogue")) {
            for(Vehicle car : cars) {
                if(car.getModel().equals(input)) {
                    System.out.println("Type: " + car.getType() + " Model: " + car.getModel() + " Color: " + car.getColor() + " Horsepower: " + car.getHorsepower());
                }
            }
            for(Vehicle truck : trucks) {
                if(truck.getModel().equals(input)) {
                    System.out.println("Type: " + truck.getType() + " Model: " + truck.getModel() + " Color: " + truck.getColor() + " Horsepower: " + truck.getHorsepower());
                }
            }
            input = scanner.nextLine();
        }

        if(!cars.isEmpty()) {
            double averageHorsepower = cars.stream().mapToInt(Vehicle::getHorsepower).average().getAsDouble();
            System.out.println("Cars have average horsepower of: " + averageHorsepower);
        }
        if(!trucks.isEmpty()) {
            double averageHorsepower = trucks.stream().mapToInt(Vehicle::getHorsepower).average().getAsDouble();
            System.out.println("Trucks have average horsepower of: " + averageHorsepower);
        }
    }
}