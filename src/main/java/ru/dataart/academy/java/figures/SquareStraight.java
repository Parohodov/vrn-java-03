package ru.dataart.academy.java.figures;

public class SquareStraight extends Figure {
    private double side;

    public SquareStraight(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }
}
