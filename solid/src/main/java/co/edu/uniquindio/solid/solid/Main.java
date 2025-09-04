package co.edu.uniquindio.solid.solid;

import co.edu.uniquindio.solid.solid.model.AreaCalculator;
import co.edu.uniquindio.solid.solid.model.Circle;
import co.edu.uniquindio.solid.solid.model.Rectangle;
import co.edu.uniquindio.solid.solid.model.Triangle;
import co.edu.uniquindio.solid.solid.service.IShape;

public class Main {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[] {
                new Rectangle(4, 5),
                new Circle(3),
                new Triangle(6, 4) // aquí ya usamos la clase Triangle
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sum(shapes);

        System.out.println("Área total: " + totalArea);
    }
}
