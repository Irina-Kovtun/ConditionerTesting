package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    
    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.maxTemperature);
        assertNull(conditioner.name);
        assertFalse(conditioner.on);

        System.out.println("Hi!");

    }

}