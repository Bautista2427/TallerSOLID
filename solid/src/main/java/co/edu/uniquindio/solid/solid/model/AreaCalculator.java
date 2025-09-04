package co.edu.uniquindio.solid.solid.model;

import co.edu.uniquindio.solid.solid.service.IShape;

public class AreaCalculator {
    public double sum(IShape[] shapes) {
        double totalArea = 0;
        for (IShape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
