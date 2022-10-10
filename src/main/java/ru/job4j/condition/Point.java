package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 10, 15, 20);
        System.out.println("result (5, 10) to (15, 20) " + result);
    }
}