package ObjectsAndClasses.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cars {

    static class Car {

        private String model;
        private Engine engine;
        private Cargo cargo;
        private List<Tire> tireList;

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tireList) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tireList = tireList;
        }

        public String getCargoType() {
            return cargo.getType();
        }

        public List<Tire> getTires() {
            return this.tireList;
        }

        public String getModel() {
            return this.model;
        }

        public int getEnginePower() {
            return engine.getPower();
        }



    }

    static class Cargo {
        private int cargoWeight;
        private String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }

        public String getType() {
            return this.cargoType;
        }
    }

    static class Engine {
        private int engineSpeed;
        private int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getPower()  {
            return this.enginePower;
        }

    }

    static class Tire {
        private double tirePressure;
        private int tireAge;

        public Tire(double tirePressure, int tireAge) {
            this.tirePressure = tirePressure;
            this.tireAge = tireAge;
        }

        public double getTirePressure() {
            return this.tirePressure;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] carInfo = scan.nextLine().split(" ");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> listTires = new ArrayList<>();
            for (int j = 5; j <= 12 ; j+=2) {
                double tirePressure = Double.parseDouble(carInfo[j]);
                int tireAge = Integer.parseInt(carInfo[j + 1]);
                listTires.add(new Tire(tirePressure, tireAge));
            }

            cars.add(new Car(model, engine, cargo, listTires));
        }

        String command = scan.nextLine();

        switch (command) {
            case "fragile":
                for (Car car : cars) {
                    if (car.getCargoType().equals("fragile")) {
                        List<Tire> tireList = car.getTires();
                        for (Tire tire : tireList) {
                            if (tire.getTirePressure() < 1.00) {
                                System.out.println(car.getModel());
                                break;
                            }
                        }
                    }
                }
                break;
            case "flamable":
                for (Car car : cars) {
                    if (car.getCargoType().equals("flamable")) {
                        if (car.getEnginePower() > 250) {
                            System.out.println(car.getModel());
                        }
                    }
                }
                break;

        }

    }
}
