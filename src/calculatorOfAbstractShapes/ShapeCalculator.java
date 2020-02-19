package calculatorOfAbstractShapes;

import static java.lang.Math.sqrt;

public class ShapeCalculator implements Calc2D, Calc3D{

    @Override
    public double shapeArea(GeometricShape shape) {
        double shapeArea=0;
        if (shape instanceof Circle){
            shapeArea=Math.PI * Math.pow(((Circle) shape).getRadius(),2);
            return shapeArea;
        }
        else if (shape instanceof Rectangle){
            shapeArea=((Rectangle) shape).getHeight()*((Rectangle) shape).getWidth();
            return shapeArea;
        }
        return shapeArea;
    }

    @Override
    public double volume(Shape3D shape) {
        double volume = 0;
        if (shape instanceof Ball){
            volume = 4/3 * Math.PI * Math.pow(((Ball) shape).getRadius(),3);
            return volume;
        }
        else if (shape instanceof Cube){
            volume = ((Cube) shape).getHeight() * ((Cube) shape).getHeight() * ((Cube) shape).getHeight();
            return volume;
        }
        return volume;
    }

}
