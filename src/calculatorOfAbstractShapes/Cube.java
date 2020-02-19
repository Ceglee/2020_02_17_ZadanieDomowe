package calculatorOfAbstractShapes;

public class Cube extends Shape3D {
    private double height;
    private double width;
    private double depth;

    public Cube(String shapeName, double height, double width, double depth) {
        super(shapeName);
        this.height = height;
        this.width = width;
        this.depth = depth;
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
