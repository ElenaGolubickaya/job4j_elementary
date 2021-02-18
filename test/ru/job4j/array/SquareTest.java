package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bount = 3;
        int[] rst = Square.calculate(bount);
        int[] expert = new int[]{0, 1, 4};
        assertThat(rst, is(expert));

    }

    @Test
    public void whenBond5Then014916() {
        int bount = 5;
        int[] rst = Square.calculate(bount);
        int[] expert = new int[]{0, 1, 4, 9, 16};
        assertThat(rst, is(expert));
    }

}