package calculatorOfAbstractShapes;

import static java.lang.Math.sqrt;

public class Line2D extends Shape2D {
    private double firstPointX;
    private double firstPointY;
    private double secondPointX;
    private double secondPointY;

    public Line2D(String shapeName, double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        super(shapeName);
        this.firstPointX = firstPointX;
        this.firstPointY = firstPointY;
        this.secondPointX = secondPointX;
        this.secondPointY = secondPointY;
    }

    public double getFirstPointX() {
        return firstPointX;
    }

    public void setFirstPointX(double firstPointX) {
        this.firstPointX = firstPointX;
    }

    public double getFirstPointY() {
        return firstPointY;
    }

    public void setFirstPointY(double firstPointY) {
        this.firstPointY = firstPointY;
    }

    public double getSecondPointX() {
        return secondPointX;
    }

    public void setSecondPointX(double secondPointX) {
        this.secondPointX = secondPointX;
    }

    public double getSecondPointY() {
        return secondPointY;
    }

    public void setSecondPointY(double secondPointY) {
        this.secondPointY = secondPointY;
    }


    double lineLength(){
        double diffX = secondPointX-firstPointX;
        double diffY = secondPointY-firstPointY;
        double lineLength=sqrt(diffX*diffX+diffY*diffY);
        return lineLength;
    }
}
