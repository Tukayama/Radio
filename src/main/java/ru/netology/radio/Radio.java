package ru.netology.radio;

public class Radio {
    private int radioStations;


    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        radioStations = newRadioStations;
    }

    private int nextCurrentRadioStation;


    public int getNextCurrentRadioStation() {

        return nextCurrentRadioStation;
    }

    public void setNextCurrentRadioStation(int newNextCurrentRadioStation) {
        nextCurrentRadioStation = newNextCurrentRadioStation;
        if (nextCurrentRadioStation == 9) {
            nextCurrentRadioStation = 0;
            return;
        }
        if (nextCurrentRadioStation < 9) {
            nextCurrentRadioStation = nextCurrentRadioStation + 1;
        }
    }

    private int prevCurrentRadioStation;

    public int getPrevCurrentRadioStation(int currentRadioStation) {
        return prevCurrentRadioStation;
    }

    public void setPrevCurrentRadioStation(int newPrevCurrentRadioStation) {
        prevCurrentRadioStation = newPrevCurrentRadioStation;
        if (prevCurrentRadioStation == 0) {
            prevCurrentRadioStation = 9;
            return;
        }
        if (prevCurrentRadioStation <= 9) {
            prevCurrentRadioStation = prevCurrentRadioStation - 1;
        }
    }

    private int increaseTheVolumeLevel;

    public int getIncreaseTheVolumeLevel(int currentVolume) {
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

    private int decreaseTheVolumeLevel;

    public int getDecreaseTheVolumeLevel(int currentVolume) {
        return decreaseTheVolumeLevel;
    }

    public void setDecreaseTheVolumeLevel(int newDecreaseTheVolumeLevel) {
        decreaseTheVolumeLevel = newDecreaseTheVolumeLevel;
        if (decreaseTheVolumeLevel == 0) {
            decreaseTheVolumeLevel = 0;
            return;
        }
        if (decreaseTheVolumeLevel <= 10) {
            decreaseTheVolumeLevel = decreaseTheVolumeLevel - 1;
        }
    }


}


