package ObjectsAndClasses.MoreExercise.P02RowData;

 class Cargo {
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
