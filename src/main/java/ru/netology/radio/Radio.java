package ru.netology.radio;

public class Radio {
    private int radioStations;

    private int currentVolume;
    private int currentStation;


    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        radioStations = newRadioStations;
    }

    void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void UpCurrentVolume() {
        if (currentVolume == 10) {
            this.currentVolume = 10;
            return;
        }
        currentVolume++;
        return;
    }

    public void DounCurrentVolume() {
        if (currentVolume == 0) {
            this.currentVolume = 0;
            return;
        }
        currentVolume--;
        return;

    }

    public void UpCurrentStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        currentStation++;
        return;
    }

    public void DownCurrentRadioStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        currentStation--;
        return;
    }
}



