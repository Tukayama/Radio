package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio coud=new Radio();
    @ParameterizedTest
    @CsvSource({
            "Station number_0,0,0",
            "Station number_5,5,5",
            "Station number_10,10,10",
    })
    public void RadioStations(String name, int currentStation, int expected) {
       coud.setCurrentStation(currentStation);
        coud.RadioStations(currentStation);

        int actual = coud.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Station number_0,0,1",
            "Station number_5,5,6",
            "Station number_10,10,0",
    })
    public void nextStationNumbeUp(String name, int currentStation, int expected) {
        Radio cond = new Radio();
        cond.setCurrentStation(currentStation);
        cond.UpCurrentStation();
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Station number_0,0,10",
            "Station number_5,5,4",
            "Station number_9,9,8",
    })
    public void nextStationNumbeDoun(String name, int currentStation, int expected) {
        Radio cond = new Radio();
        cond.setCurrentStation(currentStation);
        cond.DownCurrentRadioStation();
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volume_0,0,1",
            "volume_5,5,6",
            "volume_100,100,100",
    })
    public void increaseTheVolume(String name, int currentStation, int expected) {
        Radio cond = new Radio();
        cond.setCurrentVolume(currentStation);
        cond.UpCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);

    } @ParameterizedTest
    @CsvSource({
            "volume_0,0,0",
            "volume_5,5,4",
            "volume_100,100,99",
    })
    public void volumeReduction(String name, int currentStation, int expected) {
        Radio cond = new Radio();
        cond.setCurrentVolume(currentStation);
        cond.DounCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
