package Figure;
import Color.Color;
import java.util.Scanner;

public abstract class Figure {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract  double colorConsumption();
    public abstract double costColoringPerFigure();
    public abstract double area ();
    public Color getColor() {
        return color;
    }

}
