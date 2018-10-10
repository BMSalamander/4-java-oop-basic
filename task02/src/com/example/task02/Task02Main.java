package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(4, 20, 66);
        System.out.println("The time1 is: " + time1);

        TimeSpan time2 = new TimeSpan(22, 78, 99);
        System.out.println("The time2 is: " + time2);

        time1.add(time2);
        System.out.println("Time1 + Time2: " + time1);

        time1.subtract(time2);
        System.out.println("Time1 + Time2 - Time2: " + time1);

        time2.subtract(time1);
        System.out.println("Time2 - Time1: " + time2);
    }
}
