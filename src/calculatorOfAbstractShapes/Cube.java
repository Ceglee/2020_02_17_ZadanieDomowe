package calculatorOfAbstractShapes;

public class Cube extends Shape3D {
    private double height;

    public Cube(String shapeName, double height) {
        super(shapeName);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
