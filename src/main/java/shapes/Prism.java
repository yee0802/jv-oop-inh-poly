package shapes;

public class Prism extends Shape3D {
    public double height;

    public Prism(Shape base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
