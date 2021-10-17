package ru.dataart.academy.java.figures;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("Square, side = %.2f", side);
    }
}
