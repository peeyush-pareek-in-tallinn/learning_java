package ee.peeyushlearningjava.Abstraction;

public class Square extends ShapeAbstract {

    private final double side;

    public Square (double side) {
        this.side = side;
    }

    public double calculateArea () {
        return Math.pow(side, 2);

    }
}
