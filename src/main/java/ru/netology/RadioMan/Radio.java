package ru.netology.RadioMan;
public class Radio {
    private int currentRadioStation;
    public int currentVolume;

    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }

    public void reduceRadiostation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void reduceRadiostationPreviosly() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int radiostation) {
        currentRadioStation = radiostation;
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

