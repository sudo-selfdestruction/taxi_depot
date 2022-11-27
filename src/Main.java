package src;
import src.car.*;

public class Main {
    public static void main(String[] args) {
        SportCar supra = new SportCar(12.5, 400, 50000, "Toyota Supra");
        supra.sportModeSwitch();
//        supra.sportModeSwitch();
        System.out.println(supra);
    }
}