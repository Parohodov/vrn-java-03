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

//        for (int i = 0; i < figures.length; i++) {
//            System.out.format("%s's #%d area equals %.2f\n",
//                    figures[i].getClass().getSimpleName(), i+1, figures[i].calcArea());
//            System.out.format("%s's #%d perimeter equals %.2f\n",
//                    figures[i].getClass().getSimpleName(), i+1, figures[i].calcPerimeter());
//        }
        for (Figure figure : figures) {
            System.out.format("%s, area = %.2f\n", figure, figure.calcArea());
            System.out.format("%s, perimeter = %.2f\n", figure, figure.calcPerimeter());
        }

        System.out.println("\n================================================================");
        Calculator calculator = new Calculator();
        System.out.format("A sum of all areas equals %.2f\n", calculator.calcAreas(figures));
        System.out.format("A sum of all perimeters equal %.2f\n", calculator.calcPerimeters(figures));
    }
}