package calculatorOfAbstractShapes;

import static java.lang.Math.sqrt;

public class LineCalc extends ShapeCalculator{

    double lineLength(Line2D line){
        double diffX = line.getSecondPointX()-line.getFirstPointX();
        double diffY = line.getSecondPointY()-line.getSecondPointY();
        double lineLength=sqrt(diffX*diffX+diffY*diffY);
        return lineLength;
    }
}
