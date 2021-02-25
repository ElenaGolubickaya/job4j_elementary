package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(input));
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(input));
    }

    @Test
    public void whenSwapBorder0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(input));
    }
}