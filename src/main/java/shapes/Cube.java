package shapes;

public class Cube extends Shape3D {
    public Cube(float size) {
        this(new Rectangle(size, size));
    }

    private Cube(Rectangle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        if (base instanceof Rectangle realRectangle) {
            return realRectangle.width *realRectangle.width * realRectangle.width;
        }

        return 0;
    }
}
