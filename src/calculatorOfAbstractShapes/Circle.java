package calculatorOfAbstractShapes;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
