package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Counter1Test {

    @Test
    public void whenSumNumbersFromOneToTenThenFiftyFive() {
        int rsl = Counter1.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter1.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));

    }
}