package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K9Square1Dot44() {
        double expected = 1.44;
        int p = 8;
        double k = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K33Square1Dot02() {
        double expected = 1.02;
        int p = 12;
        double k = 33;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}