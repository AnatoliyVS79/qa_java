package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineCountParametrizedTest {
    private final int kittensCount;
    private final int expectedCount;
    Feline feline;

    public FelineCountParametrizedTest(int kittensCount, int expectedCount) {
        this.expectedCount = expectedCount;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {2, 2},
                {-1, -1},
        };
    }


    @Test
    public void testGetFelineKittensCount() {
        feline = new Feline();
        assertEquals(expectedCount, feline.getKittens(kittensCount));
    }
}
