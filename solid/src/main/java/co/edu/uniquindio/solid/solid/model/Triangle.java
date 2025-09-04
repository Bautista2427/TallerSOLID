package co.edu.uniquindio.solid.solid.model;

import co.edu.uniquindio.solid.solid.service.IShape;

public class Triangle implements IShape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
