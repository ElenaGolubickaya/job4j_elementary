package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int rsl1 = MultiMax.max(5, 2, 0);
        assertThat(rsl1, is(5));
    }

    @Test
    public void whenSecondMax() {
        int rsl2 = MultiMax.max(2, 55, 36);
        assertThat(rsl2, is(55));
    }

    @Test
    public void whenThirdMax() {
        int rsl3 = MultiMax.max(2, 59, 96);
        assertThat(rsl3, is(96));
    }

    @Test
    public void whenEveryMax() {
        int rsl4 = MultiMax.max(58, 58, 58);
        assertThat(rsl4, is(58));
    }
}