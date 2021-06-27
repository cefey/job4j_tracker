package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 3.0;
        Point a = new Point(1, 0, 1);
        Point b = new Point(0, 2, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}


