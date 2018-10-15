package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private ArrayList<Point> points;

    public PolygonalLine() {
        points = new ArrayList<Point>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new ArrayList<Point>();
        for (Point P : points) {
            this.points.add(new Point(P.getX(), P.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double sum = 0;
        for (int i = 1; i < points.toArray().length; ++i) {
            sum += (points.get(i)).getLength(points.get(i - 1));
        }
        return sum;
    }

}
