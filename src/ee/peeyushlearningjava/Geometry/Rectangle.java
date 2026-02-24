package ee.peeyushlearningjava.Geometry;

public class Rectangle {

    public int length;
    public int width;
    public int getRectangleArea;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getRectangleArea(int length, int width) {
        return length * width;
    }
}
