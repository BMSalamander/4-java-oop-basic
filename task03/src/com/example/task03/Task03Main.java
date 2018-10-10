package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(2.2, 5.5);
        ComplexNumber n2 = new ComplexNumber(7.2, 8.1);
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(n1.add(n2));
        System.out.println(n1.mult(n2));

    }
}
