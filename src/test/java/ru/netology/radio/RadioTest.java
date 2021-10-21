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
    public void getNextCurrentRadioStation() {
        Radio cond = new Radio();
        cond.setNextCurrentRadioStation(5);
        int actual = cond.getNextCurrentRadioStation();
        int expected = 6;
        assertEquals(expected, actual);
    }



    @ParameterizedTest()
    @CsvFileSource(resources = "/data2.csv", delimiter = '|', numLinesToSkip = 2)
    public void getIncreaseTheVolumeLevel(int currentVolume, int expected) {
        Radio cond = new Radio();
        cond.setIncreaseTheVolumeLevel(currentVolume);
        int actual = cond.getIncreaseTheVolumeLevel(currentVolume);
        assertEquals(expected, actual);

    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/data3.csv", delimiter = '|', numLinesToSkip = 2)
    public void getDecreaseTheVolumeLevel(int currentVolume, int expected) {
        Radio cond = new Radio();
        cond.setDecreaseTheVolumeLevel(currentVolume);
        int actual = cond.getDecreaseTheVolumeLevel(currentVolume);
        assertEquals(expected, actual);
    }
}