package Figure;
import Color.Color;


public class Parallelogram extends Rectangle {
    private int side;
    private int height;

    public Parallelogram(Color color, int side, int height) {
        super(color, side, height );
    }

    @Override
    public double area() {
        return side*height;
    }

}
