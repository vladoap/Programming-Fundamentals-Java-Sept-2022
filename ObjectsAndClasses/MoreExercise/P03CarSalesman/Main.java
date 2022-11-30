package ObjectsAndClasses.MoreExercise.P03CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        int numberEngines = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= numberEngines ; i++) {
            String[] engineArr = scan.nextLine().split(" ");
            String model = engineArr[0];
            int power = Integer.parseInt(engineArr[1]);
            int displacement = Integer.MIN_VALUE;
            String efficiency = null;
            if (engineArr.length == 3) {
                char charPos2 = engineArr[2].charAt(0);
                if (charPos2 >= 48 && charPos2 <= 57) {
                    displacement = Integer.parseInt(engineArr[2]);
                } else {
                    efficiency = engineArr[2];
                }
            } else if (engineArr.length == 4) {
                displacement = Integer.parseInt(engineArr[2]);
                efficiency = engineArr[3];
            }

            engineList.add(new Engine(model, power, displacement, efficiency));
        }

        int numberCars = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= numberCars ; i++) {
            String[] carArr = scan.nextLine().split(" ");
            String model = carArr[0];
            Engine currentEngine = null;
            int weight = Integer.MIN_VALUE;
            String color = null;
            for (Engine engine : engineList) {
                if (engine.getModel().equals(carArr[1])) {
                    currentEngine = engine;
                    break;
                }
            }

            if (carArr.length == 3) {
                char charPos2 = carArr[2].charAt(0);
                if (charPos2 >= 48 && charPos2 <= 57) {
                    weight = Integer.parseInt(carArr[2]);
                } else {
                    color = carArr[2];
                }
            } else if (carArr.length == 4) {
                weight = Integer.parseInt(carArr[2]);
                color = carArr[3];
            }

            carList.add(new Car(model, currentEngine, weight, color));
        }

        for (Car car : carList) {
            System.out.println(car.toString());
        }



    }
}
