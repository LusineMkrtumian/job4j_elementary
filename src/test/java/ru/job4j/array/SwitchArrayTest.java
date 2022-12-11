package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {5, 12, 8, 9, 3};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 8, 12, 9, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to6() {
        int[] input = {5, 55, 555, 5555, 555, 5, 55};
        int source = 5;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 55, 555, 5555, 555, 55, 5};
        assertThat(result).containsExactly(expected);
    }
}