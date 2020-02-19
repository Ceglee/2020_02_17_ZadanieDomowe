package calculatorOfAbstractShapes;

public class Rectangle extends GeometricShape {
    private double height;
    private double width;

    public Rectangle(String shapeName, double height, double width) {
        super(shapeName);
        this.height = height;
        this.width = width;
    }
}
