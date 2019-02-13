package com.amatsuka.utils.pairs;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class AdvancedPairTest {

    @Test
    public void should_return_minimum_value_of_pairs() {
        AdvancedPair<Integer> pair = new AdvancedPair<>(1, 2);

        assertThat(pair.min(), is(1));
    }

    @Test
    public void should_return_maximum_value_of_pairs() {
        AdvancedPair<Integer> pair = new AdvancedPair<>(1, 2);

        assertThat(pair.max(), is(2));
    }
}