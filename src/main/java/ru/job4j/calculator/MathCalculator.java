package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sub(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("��������� ������� �����: " + sumAndMultiply(30, 20));
        System.out.println("��������� ������� �����: " + subAndDiv(30, 20));
        System.out.println("��������� ������� �����: " + sumAll(30, 20));
    }
}