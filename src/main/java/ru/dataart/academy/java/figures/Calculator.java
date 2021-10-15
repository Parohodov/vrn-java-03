package ru.dataart.academy.java.figures;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final int INIT_FIGURES_NUM = 0xFF;

    private int figuresCounter = 0;
    private Figure[] figures = new Figure[INIT_FIGURES_NUM];
    private List<Figure> figureList = new ArrayList<>();

    public double calcAreas(Figure[] figures) {
        double area = 0;
        for(Figure figure: figures) {
            area += figure.calcArea();
        }
        return area;
    }

    public double calcAreas(List<Figure> figureList) {
        double area = 0;
        for(Figure figure: figures) {
            area += figure.calcArea();
        }
        return area;
    }

    public double calcPerimeters(Figure[] figures) {
        double perimeter = 0;
        for(Figure figure: figures) {
            perimeter += figure.calcPerimeter();
        }
        return perimeter;
    }

    public double calcPerimeters(List<Figure> figures) {
        double perimeter = 0;
        for(Figure figure: figures) {
            perimeter += figure.calcPerimeter();
        }
        return perimeter;
    }

    public double calcAreas() {
        if (figuresCounter == 0) {
            return 0;
        }
        double area = 0;
        for (Figure figure: figures) {
            area += figure.calcArea();
        }
        return 0;
    }

    public void addFigure(Figure figure) {
        if (figure == null) {
            return;
        }
        figures[figuresCounter++] = figure;
        figureList.add(figure);
    }

    public void cleanFigures() {
        figuresCounter = 0;
        figureList.clear();
    }
}
