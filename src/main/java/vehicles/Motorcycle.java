package vehicles;

public class Motorcycle extends Vehicle {
    public boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);
        this.hasSidecar = hasSidecar;
        this.engine = new MotorcycleEngine();
    }
}
