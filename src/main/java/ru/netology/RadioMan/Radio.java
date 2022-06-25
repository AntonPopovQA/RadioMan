package ru.netology.RadioMan;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }
    public void increaseMaxRadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void reduceRadioStationPrev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int radioStation) {
        if (radioStation <= 0) {
            return;
        }
        if (radioStation > 10) {
            return;
        }
        this.currentRadioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        this.currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public void reduceMinVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}

