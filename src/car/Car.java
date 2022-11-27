package src.car;

public abstract class Car {
    private double fuelConsumption;
    private double maxSpeed;
    private double cost;
    private String carName;

    public Car (double fuelConsumption, double maxSpeed,
                double cost, String carName) {
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
        this.carName = carName;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public double getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getCost() {
        return this.cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getCarName() {
        return this.carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String toString() {
        return "temp";
    }

}