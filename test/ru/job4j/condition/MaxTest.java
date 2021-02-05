package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax5To2Then5() {
        int rsl1 = Max.max(5, 2);
        assertThat(rsl1, is(5));
    }

    @Test
    public void whenMax1To7Then7() {
        int rsl2 = Max.max(1, 7);
        assertThat(rsl2, is(7));
    }

    @Test
    public void whenMax15To15Then15() {
        int rsl3 = Max.max(15, 15);
        assertThat(rsl3, is(15));
    }
}