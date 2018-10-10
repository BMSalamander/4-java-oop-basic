package com.example.task01;

import java.math.*;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() { }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void flip() {
        x = -x;
        y = -y;

        int tmp = x;
        x = y;
        y = tmp;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

}
