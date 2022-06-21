package ru.netology.RadioMan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseRadioStation() { // Переключение на следующую радиостанцию
        Radio radio = new Radio();

        radio.currentRadioStation = 5;

        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadiostationNextAfter9() { // Переключение на следующую радиостанцию после 9-ой
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceLastRadiostation() { // Переключение на предыдущую радиостанцию c последней
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        radio.reduceRadiostation();
        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceLastOtherRadiostation() { // Переключение на предыдущую радиостанцию (введение иных данных)
        Radio radio = new Radio();

        radio.currentRadioStation = 10;

        radio.reduceRadiostation();
        int expected = 10;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceRadiostation() { // Переключение на предыдущую радиостанцию
        Radio radio = new Radio();

        radio.currentRadioStation = 6;

        radio.reduceRadiostation();
        int expected = 5;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadiostationPrevioslyBefore0() { // Переключение на предыдущую радиостанцию перед 0-й
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        radio.reduceRadiostationPreviosly();
        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceRadiostationPrevioslyOtherBefore0() { // Переключение на предыдущую радиостанцию перед 0-й (введение иных данных)
        Radio radio = new Radio();

        radio.currentRadioStation = 10;

        radio.reduceRadiostationPreviosly();
        int expected = 10;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentRadiostation() { // Выставление номера радиостанции через прямое указание её номера
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        int expected = 6;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolume() { // Увеличение громкости звука
        Radio radio = new Radio();

        radio.currentVolume = 5;

        radio.increaseVolume();
        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() { // Увеличение максимальной громкости звука
        Radio radio = new Radio();

        radio.currentVolume = 10;

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() { // Уменьшение громкости звука
        Radio radio = new Radio();

        radio.currentVolume = 10;

        radio.reduceVolume();
        int expected = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceOtherVolume() { // Уменьшение громкости звука (введение иных данных)
        Radio radio = new Radio();

        radio.currentVolume = 11;

        radio.reduceVolume();
        int expected = 11;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() { // Уменьшение минимальной громкости звука
        Radio radio = new Radio();

        radio.currentVolume = 0;

        radio.reduceMinVolume();
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceMinOtherVolume() { // Уменьшение минимальной громкости звука (введение иных данных)
        Radio radio = new Radio();

        radio.currentVolume = 11;

        radio.reduceMinVolume();
        int expected = 11;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    }
