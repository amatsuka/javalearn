package com.amatsuka.utils.pairs;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PairMaxIteratorTest {

    @Test(expected = NoSuchElementException.class)
    public void should_throw_exception_on_end() {
        Iterator<Integer> iterator = new PairMaxIterator<>(asList(new AdvancedPair(1,2)));

        iterator.next();
        iterator.next();

    }

    @Test
    public void should_iterate() {
        Iterator<Integer> iterator = new PairMaxIterator<>(asList(new AdvancedPair(1,2), new AdvancedPair(3,2), new AdvancedPair(1,5)));

        assertThat(iterator.next(), is(2));
        assertThat(iterator.hasNext(), is(true));

        assertThat(iterator.next(), is(3));
        assertThat(iterator.hasNext(), is(true));

        assertThat(iterator.next(), is(5));
        assertThat(iterator.hasNext(), is(false));


    }
}