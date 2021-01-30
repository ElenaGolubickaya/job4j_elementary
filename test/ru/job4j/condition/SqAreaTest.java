package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1then1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double rsl1 = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl1, 0.01);
    }

    @Test
    public void whenP6K2then2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double rsl2 = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl2, 0.01);
    }
}