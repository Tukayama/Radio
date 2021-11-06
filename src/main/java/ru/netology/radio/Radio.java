package ru.netology.radio;

public class Radio {
//    private int radioStations;
    private int minNumberStation = 0;
    private int maxNumberStation = 10;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentVolume;
    private int currentStation;

//
//    public int getRadioStations() {
//        return radioStations;
//    }

//    public Radio(int maxNumberStation) {
//        this.maxNumberStation = maxNumberStation;
//    }

    public void RadioStations(int currentStation) {
        if (currentStation >= maxNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        if (currentStation <= minNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        this.currentStation=currentStation;
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
        if (currentVolume == maxSoundVolume) {
            this.currentVolume = maxSoundVolume;
            return;
        }
        currentVolume++;
        return;
    }

    public void DounCurrentVolume() {
        if (currentVolume == minSoundVolume) {
            this.currentVolume = minSoundVolume;
            return;
        }
        currentVolume--;
        return;

    }

    public void UpCurrentStation() {
        if (currentStation >= maxNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        currentStation++;
        return;
    }

    public void DownCurrentRadioStation() {
        if (currentStation == minNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        currentStation--;
        return;
    }

}



