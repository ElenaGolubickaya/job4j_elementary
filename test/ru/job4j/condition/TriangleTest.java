package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist1() {
        boolean result1 = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result1, is(true));
    }

    @Test
    public void whenExist2() {
        boolean result2 = Triangle.exist(2.0, 3.0, 15.0);
        assertThat(result2, is(false));
    }
}