package ObjectsAndClasses.MoreExercise.P02RowData;

 class Engine {
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
