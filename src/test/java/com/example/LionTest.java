package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;
    @Mock
    Feline feline;

    @Before
    public void setLion() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }

    @Test
    public void doesLionHaveManeTest() throws Exception {
        assertTrue("Ожидаем true", lion.doesHaveMane());
    }

    @Test
    public void lionHasNoManeTest() throws Exception {
        Lion lioness = new Lion("Самка", feline);
        assertFalse("Ожидаем false", lioness.doesHaveMane());
    }


    @Test
    public void getLionFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава", "Различные растения"));
        assertEquals("Ожидаем список травоядного", List.of("Трава", "Различные растения"), lion.getFood());
    }
    @Test
    public void getExceptionLionSexTest() {
        assertThrows("Ожидаем Exception", Exception.class, () -> {new Lion("Some sex", feline);
        });
    }

}
