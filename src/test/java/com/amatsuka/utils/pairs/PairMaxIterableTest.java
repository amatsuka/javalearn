package com.amatsuka.utils.pairs;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PairMaxIterableTest {

    @Test
    public void should_return_right_iterator() {
        Iterable<Integer> iterable = new PairMaxIterable<>(asList(new AdvancedPair(1,2), new AdvancedPair(3,2), new AdvancedPair(1,5)));

        assertThat(iterable.iterator(), instanceOf(PairMaxIterator.class));

    }
}