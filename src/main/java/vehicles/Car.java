package vehicles;

public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
        this.engine = new CarEngine();
    }
}
