package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static boolean check(int number) {
        boolean prime = number == 1 ? true : false;
        for (int num = 2; num < number; num++) {
            if ((number % num) == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
