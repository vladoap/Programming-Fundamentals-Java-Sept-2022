package ObjectsAndClasses.MoreExercise.P03CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.model + ":\n");
        sb.append("  ");
        sb.append(engine.getModel() + ":\n");
        sb.append("    ");
        sb.append("Power: " + engine.getPower() + "\n");
        sb.append("    ");
        sb.append("Displacement: ");
        if (engine.getDisplacement() >= 0) {
            sb.append(engine.getDisplacement());
        } else {
            sb.append("n/a");
        }
        sb.append(System.lineSeparator());
        sb.append("    ");
        sb.append("Efficiency: ");
        if (engine.getEfficiency() != null) {
            sb.append(engine.getEfficiency());
        } else {
            sb.append("n/a");
        }
        sb.append(System.lineSeparator());
        sb.append("  ");
        sb.append("Weight: ");
        if (this.weight >= 0) {
            sb.append(this.weight);
        } else {
            sb.append("n/a");
        }
        sb.append(System.lineSeparator());
        sb.append("  ");
        sb.append("Color: ");
        if (this.color != null) {
            sb.append(this.color);
        } else {
            sb.append("n/a");
        }





        return sb.toString();
    }

}
