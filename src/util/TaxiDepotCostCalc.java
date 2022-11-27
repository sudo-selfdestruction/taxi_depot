package src.util;
import src.car.Car;
public class TaxiDepotCostCalc {
    public double costCalc(Car[] cars) {
        double totalCost = 0;
        for (Car car : cars) {
            totalCost += car.getCost();
        }
        return totalCost;
    }
}
