package src.car;

public class SportCar extends Car {
    private boolean sportMode;

    public SportCar(double fuelConsumption, double maxSpeed,
                    double cost, String carName) {
        super(fuelConsumption, maxSpeed, cost, carName);
    }

    public void sportModeSwitch() {
        this.sportMode = !this.sportMode;
        if(this.sportMode) {
            this.setMaxSpeed(this.getMaxSpeed() * 1.5);
        }
        else {
            this.setMaxSpeed((this.getMaxSpeed() * 2) / 3);
        }
    }
    public String toString() {
        return ("Sport car name: " + this.getCarName() + "\n" +
                "Max speed: " + this.getMaxSpeed() + " mph\n" +
                "Cost: " + this.getCost() + "$\n" +
                "Fuel consumption: " + this.getFuelConsumption() + " l/60mile\n" +
                "Sport mode status: " + this.sportMode + "\n"
        );
    }
}