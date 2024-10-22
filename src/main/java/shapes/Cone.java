package shapes;

public class Cone extends Shape3D {
    public double height;

    public Cone(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return ((base.calculateArea() * height) / 3);
    }
}
