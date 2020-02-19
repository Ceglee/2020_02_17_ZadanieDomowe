package calculatorOfAbstractShapes;

public class Ball extends Shape3D {
    private double radius;

    public Ball(String shapeName, double radius) {
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
