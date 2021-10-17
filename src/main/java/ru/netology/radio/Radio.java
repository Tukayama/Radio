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

    public int getNextCurrentRadioStation(int currentRadioStation) {

        return nextCurrentRadioStation;
    }

    public byte setNextCurrentRadioStation(int newNextCurrentRadioStation) {
        nextCurrentRadioStation = newNextCurrentRadioStation;
        if (nextCurrentRadioStation == 9) {
            nextCurrentRadioStation = 0;
            return 0;
            // } else
            // if (currentRadioStation == 0) {
            // currentRadioStation = 9;
//return;
        }
        if (nextCurrentRadioStation < 9) {
            nextCurrentRadioStation = nextCurrentRadioStation + 1;
        }
        return 0;
    }

    public int prevCurrentRadioStation;

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

    public int increaseTheVolumeLevel;

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

    public int decreaseTheVolumeLevel;

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


