package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void getFelineFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ожидается список еды хищника", expected, feline.eatMeat());
    }

    @Test
    public void getFelineFamilyTest() {
        String expected = "Кошачьи";
        assertEquals("Ожидаем \"Кошачьи\"", expected, feline.getFamily());
    }

    @Test
    public void getFelineKittensTest() {
        int expected = 1;
        assertEquals("Ожидаем 1", expected, feline.getKittens());
    }

    @Test
    public void getFelineKittensCountTest() {
        int expected = 10;
        assertEquals("Ожидаем 10", expected, feline.getKittens(10));
    }
}
