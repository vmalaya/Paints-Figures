package Figure;
import Color.Color;
import static java.lang.Math.pow;


public class Circle extends Figure {
    private  int radius;

    public Circle( Color color, int radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double colorConsumption() {
        double colorConsumption =  this.area() * getColor().getColorConsumptionPerSqMeter();
        return colorConsumption;
    }
    public double costColoringPerFigure(){
        double costColoringPerFigure = this.colorConsumption() * getColor().getPricePerLiter();
        return  costColoringPerFigure;
    }

    @Override
    public double area() {
        return (3.14* pow((double)radius, 2));

    }
}
