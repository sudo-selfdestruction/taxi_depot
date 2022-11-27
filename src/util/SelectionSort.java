package src.util;
import src.car.Car;

public class SelectionSort {
    public void selectionSort(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            double minFuelConsumption =
                    cars[i].getFuelConsumption();
            int minPos = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() <
                        minFuelConsumption) {
                    minPos = j;
                    minFuelConsumption =
                            cars[j].getFuelConsumption();
                }
            }
            Car tmp = cars[minPos];
            cars[minPos] = cars[i];
            cars[i] = tmp;
        }
    }
}
