package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat cat;

    @Before
    public void setUp() throws Exception {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getCatSoundTest() {
        String expectedSound = "Мяу";
        assertEquals("Ожидаем звук мяу", expectedSound, cat.getSound());

    }

    @Test
    public void getCatFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ожидаем перечисление списка еды кота", expectedFood, cat.getFood());
    }
}
