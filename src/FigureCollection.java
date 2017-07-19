import Figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureCollection {
    private List figures = new ArrayList();

    public double totalCostColoring(){
        double totalCost = 0.0;
        for (Object o : figures) {
            Figure figure = (Figure) o;
            totalCost += figure.costColoringPerFigure();
        }
        return totalCost;
    }
    public double totalWeightPaint(){
        double totalWeight = 0.0;
        for (Object o: figures) {
            Figure figure =(Figure)o;
            totalWeight += figure.colorConsumption();
        }
        return totalWeight;
    }
    public double totalFigureArea(){
        double totalArea = 0.0;
        for (Object o:figures) {
            Figure figure = (Figure) o;
            totalArea += figure.area();
        }
        return totalArea;
    }
    public void add(Figure figure){
        figures.add(figure);
    }
    public  void remove(Figure figure){
        figures.remove(figure);
    }


}
