package ru.netology.radio;

public class Radio {
    private int radioStations;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        radioStations = newRadioStations;
    }

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void Radio(int minVolume, int maxVolume, int minStation, int maxStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setUpCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDownCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        this.currentStation = currentStation;

    }

    public void setUpCurrentStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
     this.currentStation++;

    }public void setDownCurrentRadioStation(){
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }
}


