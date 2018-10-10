package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line l1 = new Line(new Point(2,4), new Point(8, 9));
        Point p = new Point(4, 6);
        Point colPoint = new Point(2, 4);

        if (l1.isCollinearLine(p)) {
            System.out.println("p is here!");
        }

        if (l1.isCollinearLine(colPoint)) {
            System.out.println("colPoint is really co(o)l");
        }

    }
}
