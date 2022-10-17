package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when510to1520then14Dot14() {
        double expected = 14.14;
        int x1 = 5;
        int y1 = 10;
        int x2 = 15;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to67then5Dot65() {
        double expected = 5.65;
        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to1010then7Dot07() {
        double expected = 7.07;
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}