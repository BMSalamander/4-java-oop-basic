package com.example.task03;

import java.math.*;

public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double imaginePart) {
        real = realPart;
        image = imaginePart;
    }

    public void setReal(double realPart) {
        real = realPart;
    }

    public double getReal() {
        return real;
    }

    public void setImage(double imaginePart) {
        image = imaginePart;
    }

    public double getImage() {
        return image;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.real, image + number.image);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newReal = real * number.real - image * number.image;
        double newImage = real * number.image + number.real * image;
        return new ComplexNumber(newReal, newImage);
    }

    public String toString() {
        return Double.toString(real) + (image < 0 ? "-" : "+") + Double.toString(image) + "i";
    }

}
