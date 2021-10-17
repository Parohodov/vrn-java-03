package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return base * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (base + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle, base = %.2f, height = %.2f", base, height);
    }
}
