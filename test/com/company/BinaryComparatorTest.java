package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryComparatorTest {

    @Test
    public void compareNumbers() {
        BinaryComparator comparator =
                new BinaryComparator(new SimpleGenerator(16807), new SimpleGenerator(48271));
        assertEquals(3868, comparator.compareNumbers(65, 8921));
        assertEquals(3926, comparator.compareNumbers(635, 12));
    }
}
