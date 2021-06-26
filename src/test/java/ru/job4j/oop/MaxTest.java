package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Or6Then6() {
        int result = Max.max(3, 2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax3To3Or5Or7Then7() {
        int result = Max.max(3, 3, 5, 7);
        assertThat(result, is(7));
    }
}