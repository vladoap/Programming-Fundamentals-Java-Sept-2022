package ObjectsAndClasses.Exercise.P05VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle (String type, String model, String color, int horsePower) {
        if (type.equals("car")) {
            this.type = "Car";
        } else {
            this.type = "Truck";
        }

        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel () {
        return this.model;
    }

    public String getType () {
        return this.type;
    }

    public int getHorsePower () {
        return this.horsePower;
    }

    @Override
    public String toString () {
     return String.format("Type: " + this.type + "\n" +
             "Model: " + this.model + "\n" +
             "Color: " + this.color + "\n" +
             "Horsepower: " + this.horsePower );

    }
}
