package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when05to28then7() {
        int x1 = 0;
        int x2 = 5;
        int x3 = 2;
        int x4 = 8;
        double expected = 7.81;
        double rsl1 = Point.distance(0, 5, 2, 8);
        Assert.assertEquals(expected, rsl1, 0.01);
    }

    @Test
    public void when210to215then15() {
        int x1 = 2;
        int x2 = 10;
        int x3 = 2;
        int x4 = 15;
        double expected = 15.264;
        double rsl2 = Point.distance(2, 10, 2, 15);
        Assert.assertEquals(expected, rsl2, 0.01);

    }

    @Test
    public void when14to27then5() {
        int x1 = 1;
        int x2 = 4;
        int x3 = 2;
        int x4 = 7;
        double expected = 5.83;
        double rsl3 = Point.distance(1, 4, 2, 7);
        Assert.assertEquals(expected, rsl3, 0.01);
    }
}