package src.util;
import src.car.Car;

public class SearchByMaxSpeed {
    public Car searchBySpeed(Car[] cars,
                             double minSpeed,
                             double maxSpeed) {
        for(Car car : cars) {
            if(car.getMaxSpeed() < maxSpeed &&
                    car.getMaxSpeed() > minSpeed) {
                return car;
            }
        }
        return null;
    }
}
