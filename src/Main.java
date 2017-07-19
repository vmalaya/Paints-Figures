import Color.Black;
import Color.Red;
import Figure.Circle;
import Figure.Square;

public class Main {
    public static void main(String[] args) {
        Black black = new Black("Black", 0.17, 45);
        Red red = new Red("Red", 0.2, 54);
        Circle circle = new Circle(red, 4);
        Square square = new Square(black, 5);
        FigureCollection figures = new FigureCollection();
        figures.add(circle);
        figures.add(square);

        System.out.println( figures.totalFigureArea());

    }
}
