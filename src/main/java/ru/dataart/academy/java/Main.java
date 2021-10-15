package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP\n=====================================================\n\n");

        Figure[] figures = new Figure[] {
                new Circle(1),
                new Circle(5.34),
                new Rectangle(2,4),
                new Rectangle(1.4,6.8),
                new Square(2),
                new Square(6.6)
        };

        Calculator calc = new Calculator();
        System.out.format("Areas equals %.2f\n", calc.calcAreas(figures));
        System.out.format("Perimeters equals %.2f\n", calc.calcPerimeters(figures));
    }
}