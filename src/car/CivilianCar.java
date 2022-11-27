package src.car;

public class CivilianCar extends Car {
    public CivilianCar(double fuelConsumption, double maxSpeed,
                       double cost, String carName) {
        super(fuelConsumption, maxSpeed, cost, carName);
    }
    public String toString() {
        return ("Car name: " + this.getCarName() + "\n" +
                "Max speed: " + this.getMaxSpeed() + " mph\n" +
                "Cost: " + this.getCost() + "$\n" +
                "Fuel consumption: " + this.getFuelConsumption() + " l/60mile\n"
        );
    }
}