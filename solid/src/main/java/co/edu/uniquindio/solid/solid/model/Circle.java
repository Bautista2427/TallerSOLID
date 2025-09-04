package co.edu.uniquindio.solid.solid.model;

import co.edu.uniquindio.solid.solid.service.IShape;

public class Circle implements IShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
