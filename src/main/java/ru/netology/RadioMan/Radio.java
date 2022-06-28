package ru.netology.RadioMan;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int amountRadio) {
        this.maxRadioStation = amountRadio - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int radioStation) {
        if (radioStation < minRadioStation) {
            return;
        }
        if (radioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = radioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void reduceRadioStationPrev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void reduceMinVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
    }
}

