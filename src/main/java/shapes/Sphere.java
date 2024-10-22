package shapes;

public class Sphere extends Shape3D {
    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        if (base instanceof Circle realBase) {
            return ((Math.PI * (realBase.radius * realBase.radius * realBase.radius) * ((double) 4 / 3)));
        }

        return 0;
    }
}
