package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

//    @Test
//    public void shouldCreate() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(20, conditioner.getCurrentTemperature());
//        assertEquals(10, conditioner.getMinTemperature());
//        assertEquals(30, conditioner.getMaxTemperature());
//        assertNull(conditioner.getName());
//        assertFalse(conditioner.isOn());
//    }

    @Test
     void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 21;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}