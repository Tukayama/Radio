package ru.netology.radio;

public class Radio {
    public int radioStations;

    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        radioStations = newRadioStations;
    }

    public int nextCurrentRadioStation;

    public int getNextCurrentRadioStation() {
        return nextCurrentRadioStation;
    }

    public void setNextCurrentRadioStation(int newNextCurrentRadioStation) {
        nextCurrentRadioStation = newNextCurrentRadioStation;
        if (nextCurrentRadioStation == 9) {
            nextCurrentRadioStation = 0;
            return;
            // } else
            // if (currentRadioStation == 0) {
            // currentRadioStation = 9;
//return;
        }
        if (nextCurrentRadioStation < 9) {
            nextCurrentRadioStation = nextCurrentRadioStation + 1;
        }
    }

    public int prevCurrentRadioStation;

    public int getPrevCurrentRadioStation() {
        return prevCurrentRadioStation;
    }

    public void setPrevCurrentRadioStation(int newPrevCurrentRadioStation) {
        prevCurrentRadioStation = newPrevCurrentRadioStation;
        if (prevCurrentRadioStation == 0) {
            prevCurrentRadioStation = 9;
            return;
        }
        if (prevCurrentRadioStation < 9) {
            prevCurrentRadioStation = prevCurrentRadioStation - 1;
        }
    }

    public int increaseTheVolumeLevel;

    public int getIncreaseTheVolumeLevel() {
        return increaseTheVolumeLevel;
    }

    public void setIncreaseTheVolumeLevel(int newIncreaseTheVolumeLevel) {
        increaseTheVolumeLevel = newIncreaseTheVolumeLevel;
        if (increaseTheVolumeLevel == 10) {
            increaseTheVolumeLevel = 10;
            return;
        }
        if (increaseTheVolumeLevel <= 10) {
            increaseTheVolumeLevel = increaseTheVolumeLevel + 1;
        }
    }
    public int decreaseTheVolumeLevel ;

    public int getDecreaseTheVolumeLevel() {
        return decreaseTheVolumeLevel;
    }

    public void setDecreaseTheVolumeLevel(int newDecreaseTheVolumeLevel) {
        decreaseTheVolumeLevel = newDecreaseTheVolumeLevel;
        if (decreaseTheVolumeLevel == 0) {
            decreaseTheVolumeLevel = 0;
            return;
        }
        if (decreaseTheVolumeLevel <= 10) {
            decreaseTheVolumeLevel = decreaseTheVolumeLevel- 1;
        }
    }

    }


