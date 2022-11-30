package ObjectsAndClasses.Exercise.P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        String inputLine = scan.nextLine();

        while (!inputLine.equals("End")) {
            String[] inputArr = inputLine.split(" ");
            String type = inputArr[0];
            String model = inputArr[1];
            String color = inputArr[2];
            int horsePower = Integer.parseInt(inputArr[3]);
            vehicles.add(new Vehicle(type, model, color, horsePower));

            inputLine = scan.nextLine();
        }
        String modelInput = scan.nextLine();
        while (!modelInput.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(modelInput)){
                    System.out.println(vehicle.toString());
                }
            }
            modelInput = scan.nextLine();
        }
        double sumHorsePowerCars = 0;
        double sumHorsePowerTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Car")) {
                countCars++;
                sumHorsePowerCars += vehicle.getHorsePower();
            } else if (vehicle.getType().equals("Truck")) {
                countTrucks++;
                sumHorsePowerTrucks += vehicle.getHorsePower();
            }
        }

        double averageHpCars = sumHorsePowerCars * 1.00 / countCars;
        if (countCars == 0) {
           averageHpCars = 0;
        }
        double averageHpTrucks = sumHorsePowerTrucks * 1.00 / countTrucks;
        if (countTrucks == 0) {
            averageHpTrucks = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHpCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHpTrucks);

    }
}
