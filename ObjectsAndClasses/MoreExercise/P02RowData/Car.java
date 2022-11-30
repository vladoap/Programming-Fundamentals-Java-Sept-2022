package ObjectsAndClasses.MoreExercise.P02RowData;

import java.util.List;

class Car {


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
