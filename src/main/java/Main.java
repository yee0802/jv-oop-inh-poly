import vehicles.Car;
import vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "la-ferrari");
        Car tesla = new Car("Tesla", "Y");

        Motorcycle honda = new Motorcycle("Honda", "PCX", false);
        Motorcycle germanMotorcycle = new Motorcycle("BMW", "sidecar", true);

        ferrari.drive();
        tesla.drive();

        honda.start();
        germanMotorcycle.start();

        honda.drive();
        germanMotorcycle.drive();
    }
}
