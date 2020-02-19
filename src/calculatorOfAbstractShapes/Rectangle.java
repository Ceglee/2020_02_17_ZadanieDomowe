package calculatorOfAbstractShapes;

public class Rectangle extends GeometricShape {
    private double height;
    private double width;

    public Rectangle(String shapeName, double height, double width) {
        super(shapeName);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
