package calculatorOfAbstractShapes;

public class Main {
    public static void main(String[] args) {
        Line2D line2D = new Line2D("Line", 12.7, 3.8, 8.2, 6.4);
        LineCalc lineCalc = new LineCalc();

        System.out.println(lineCalc.lineLength(line2D));
    }
}
