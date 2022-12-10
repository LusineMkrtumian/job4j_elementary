package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index <= (array.length - index - 1); index++) {
            int num = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = num;
        }
        return array;
    }
}