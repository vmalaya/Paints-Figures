package Figure;

import Color.Color;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;


    public Triangle(Color color, int firstSide) {
        super(color);
        this.firstSide = firstSide;
    }
    public Triangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of triangle: 1 - equilateral triangle;" +
                " 2 - right triangle; 3 - Versatile triangle");
        double result = 0;
        int value = scanner.nextInt();
        switch (value){
            case 1:
                result = ((sqrt(3)* (firstSide*firstSide))/4);
                break;
            case 2:
                result = ((firstSide*secondSide)/2);
                break;
            case 3:
                double p = (firstSide + secondSide + thirdSide)/2;
                result = sqrt( p * (p - firstSide) * (p - secondSide) * (p - thirdSide) );
                break;
        }
        return  result;
    }

}
