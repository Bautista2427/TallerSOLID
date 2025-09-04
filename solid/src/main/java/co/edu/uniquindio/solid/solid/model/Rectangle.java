package co.edu.uniquindio.solid.solid.model;

import co.edu.uniquindio.solid.solid.service.IShape;

public class Rectangle implements IShape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public double getArea() {
        return width * height;
    }
}
