package ru.netology.radio;

import org.junit.jupiter.api.Test;

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
    public void getNextCurrentRadioStation() {
        Radio cond = new Radio();
        cond.setNextCurrentRadioStation(5);
        int actual = cond.getNextCurrentRadioStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void getPrevCurrentRadioStation() {
        Radio cond = new Radio();
        cond.setPrevCurrentRadioStation(0);
        int actual = cond.getPrevCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseTheVolumeLevel() {
        Radio cond = new Radio();
        cond.setIncreaseTheVolumeLevel(8);
        int actual = cond.getIncreaseTheVolumeLevel();
        int expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void getDecreaseTheVolumeLevel() {
        Radio cond = new Radio();
        cond.setDecreaseTheVolumeLevel(0);
        int actual = cond.getDecreaseTheVolumeLevel();
        int expected = 0;
        assertEquals(expected, actual);
    }
}