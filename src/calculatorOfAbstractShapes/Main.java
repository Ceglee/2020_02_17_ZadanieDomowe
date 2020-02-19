package calculatorOfAbstractShapes;

public class Main {
    public static void main(String[] args) {

        Line2D line2D = new Line2D("line", 12.7, 3.8, 8.2, 6.4);
        Circle circle = new Circle("circle", 7.2);
        Rectangle rectangle = new Rectangle("rectangle", 5.8, 3.7);
        Ball ball = new Ball("ball", 6.4);
        Cube cube = new Cube("cube", 10);
        LineCalc lineCalc = new LineCalc();
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double calculatedLine = 0;
        double calculatedCircleArea=0;
        double calculatedRectangleArea=0;
        double calculatedBallVolume=0;
        double calculatedCubeVolume=0;

        Shape[] shapes = new Shape[]{line2D, circle, rectangle, ball, cube};

        for (int i=0; i<shapes.length; i++){
            if (shapes[i] instanceof Line2D) lineCalc.lineLength(line2D);
            else if (shapes[i] instanceof Circle) calculatedCircleArea = shapeCalculator.shapeArea(circle);
            else if (shapes[i] instanceof Rectangle) calculatedRectangleArea = shapeCalculator.shapeArea(rectangle);
            else if (shapes[i] instanceof Ball) calculatedBallVolume = shapeCalculator.volume(ball);
            calculatedCubeVolume = shapeCalculator.volume(cube);
        }

        for (int i=0; i<shapes.length; i++){
            if (shapes[i] instanceof Line2D)
                System.out.println("Odcinek wyznaczony przez wspolrzedne ["
                        +line2D.getFirstPointX()+","+line2D.getFirstPointY()
                        +"], ["+line2D.getSecondPointX()+","+line2D.getSecondPointY()+"] ma dlugosc "
                        +calculatedLine);
            else if (shapes[i] instanceof Circle) System.out.println("Kolo o promieniu R="+circle.getRadius()+" ma pole = "+calculatedCircleArea);
            else if (shapes[i] instanceof Rectangle) System.out.println("Prostokat o dlugosciach bokow A="+rectangle.getWidth()+" i B="+rectangle.getHeight()+" ma pole = "+ calculatedRectangleArea);
            else if (shapes[i] instanceof Ball) System.out.println("Kula o promieniu R="+ball.getRadius()+" ma objetosc=" +calculatedBallVolume);
            else  System.out.println("Szescian o krawedzi A="+cube.getHeight()+" ma objetosc= "+ calculatedCubeVolume);
        }

    }

}
