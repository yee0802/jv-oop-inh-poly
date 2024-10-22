package shapes;

public class Pyramid extends Shape3D {
    public double height;

    public Pyramid(Shape base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return ((base.calculateArea() * height) / 3);
    }
}
