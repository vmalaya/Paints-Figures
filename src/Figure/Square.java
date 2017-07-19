package Figure;
import Color.Color;

public class Square extends Figure {
    private  int side;


    public Square( Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double colorConsumption() {
        double colorConsumption =  this.area() * getColor().getColorConsumptionPerSqMeter();
        return colorConsumption;
    }

    @Override
    public double costColoringPerFigure() {
        double costColoringPerFigure = this.colorConsumption() * getColor().getPricePerLiter();
        return  costColoringPerFigure;
    }

    @Override
    public double area() {
        return side*side;
    }
}
