package com.amatsuka.utils.pairs;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PairTest {

    @Test
    public void should_return_first_and_second_members() {
        Pair<Integer> pair = new Pair<>(1, 2);

        assertThat(pair.getFirst(), is(1));

        assertThat(pair.getSecond(), is(2));
    }
}