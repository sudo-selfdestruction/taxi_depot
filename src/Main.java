package src;
import src.car.*;
import src.util.*;

public class Main {
    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        CarsOutput output = new CarsOutput();
        TaxiDepotCostCalc costCalc = new TaxiDepotCostCalc();
        SearchByMaxSpeed searchBySpeed = new SearchByMaxSpeed();

        SportCar supra = new SportCar(12.5, 400, 50000, "Toyota Supra");
        CivilianCar polik = new CivilianCar(9.5, 150, 10000, "Volkswagen Polo");
        CivilianCar logan = new CivilianCar(8, 130, 8000, "Renault Logan");

        supra.sportModeSwitch();

        final int carsSize = 3;
        Car[] cars = new Car[carsSize];
        cars[0] = supra;
        cars[1] = polik;
        cars[2] = logan;

        sorter.selectionSort(cars);
        output.carsOutput(cars);
        System.out.println("\nTaxi depot cost: " +
                costCalc.costCalc(cars) + "\n");
        System.out.println("Car with max speed" +
                " between 300 and 700 mph: \n" +
                searchBySpeed.searchBySpeed(cars,
                        300, 700));
    }
}