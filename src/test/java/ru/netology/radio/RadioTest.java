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

    @ParameterizedTest()
    @CsvFileSource(resources = "/data.csv", delimiter = '|', numLinesToSkip = 2)
    public void getNextCurrentRadioStation(int currentRadioStation, int expected) {
        Radio cond = new Radio();
        cond.setNextCurrentRadioStation(currentRadioStation);
       int actual = cond.getNextCurrentRadioStation(currentRadioStation);

        assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/data1.csv", delimiter = '|', numLinesToSkip = 2)
    public void getPrevCurrentRadioStation(int currentRadioStation, int expected) {
        Radio cond = new Radio();
        cond.setPrevCurrentRadioStation(currentRadioStation);
        int actual = cond.getPrevCurrentRadioStation(currentRadioStation);
                assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/data2.csv", delimiter = '|', numLinesToSkip = 2)
    public void getIncreaseTheVolumeLevel(int currentVolume,int expected ) {
        Radio cond = new Radio();
        cond.setIncreaseTheVolumeLevel(currentVolume);
        int actual = cond.getIncreaseTheVolumeLevel(currentVolume);
                assertEquals(expected, actual);

    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/data3.csv", delimiter = '|', numLinesToSkip = 2)
    public void getDecreaseTheVolumeLevel(int currentVolume,int expected) {
        Radio cond = new Radio();
        cond.setDecreaseTheVolumeLevel(currentVolume);
        int actual = cond.getDecreaseTheVolumeLevel(currentVolume);
               assertEquals(expected, actual);
    }
}