package Figure;

import Color.Color;

public class Rectangle extends Figure implements CalculableRectangle{
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide*secondSide;
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

}
