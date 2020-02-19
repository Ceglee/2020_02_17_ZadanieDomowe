package calculatorOfAbstractShapes;

public class Main {
    public static void main(String[] args) {

        Line2D line2D = new Line2D("Line", 12.7, 3.8, 8.2, 6.4);
        Circle circle = new Circle("circle", 7.2);
        Rectangle rectangle = new Rectangle("rectangle", 5.8, 3.7);
        Ball ball = new Ball("ball", 6.4);
        Cube cube = new Cube("cube", 10, 8, 7);

        LineCalc lineCalc = new LineCalc();
        System.out.println(lineCalc.lineLength(line2D));

        Shape[] shapes = new Shape[]{line2D, circle, rectangle, ball, cube};

    }
}
