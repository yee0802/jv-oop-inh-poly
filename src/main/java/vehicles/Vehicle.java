package vehicles;

public abstract class Vehicle {
    public String make;
    public String model;
    public int speed;
    public Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (this.engine.running) {
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();
}
