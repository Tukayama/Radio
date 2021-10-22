package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void getRadioStations() {
        Radio cond = new Radio();
        cond.setRadioStations(5);
        int actual = cond.getRadioStations();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setUpCurrentVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.setUpCurrentVolume();
        int expected = 10;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    public void setDownCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setDownCurrentVolume();
        int expected = 0;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    public void setUpCurrentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);
        cond.setUpCurrentStation();
        int expected = 9;
        assertEquals(expected, cond.getCurrentStation());

    }
    @Test
    public void setDownCurrentRadioStation(){
        Radio cond = new Radio();
        cond.setCurrentStation(2);
        cond.setDownCurrentRadioStation();
        int expected =1;
        assertEquals(expected,cond.getCurrentStation());
    }
}