import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        while(n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];

            Car car;
            if(tokens.length == 1) {
                car = new Car(brand);
            } else {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand , model ,horsePower);
            }
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}