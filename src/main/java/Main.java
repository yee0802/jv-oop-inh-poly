import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;
import vehicles.Car;
import vehicles.Motorcycle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
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
        */

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }
    }
}
