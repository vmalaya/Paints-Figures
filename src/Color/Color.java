package Color;


public class Color {
    private  String name;
    private double colorConsumptionPerSqMeter;
    private int pricePerLiter;

    public Color(String name, double colorConsumptionPerSqMeter, int pricePerLiter) {
        this.name = name;
        this.colorConsumptionPerSqMeter = colorConsumptionPerSqMeter;
        this.pricePerLiter = pricePerLiter;
    }

    public String getName() {
        return name;
    }

    public double getColorConsumptionPerSqMeter() {
        return colorConsumptionPerSqMeter;
    }

    public int getPricePerLiter() {
        return pricePerLiter;
    }
}
