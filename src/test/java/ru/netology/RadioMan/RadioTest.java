package ru.netology.RadioMan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseRadioStation() { // Переключение на следующую радиостанцию
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNextAfter9() { // Переключение на следующую радиостанцию после 9-ой
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceLastRadioStation() { // Переключение на предыдущую радиостанцию c последней
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.reduceRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceLastOtherRadioStation() { // Переключение на предыдущую радиостанцию (введение иных данных)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        radio.reduceRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStation() { // Переключение на предыдущую радиостанцию
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        radio.reduceRadioStation();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationPrevBefore0() { // Переключение на предыдущую радиостанцию перед 0-й
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.reduceRadioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationPrevOtherBefore0() { // Переключение на предыдущую радиостанцию перед 0-й (введение иных данных)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        radio.reduceRadioStationPrev();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() { // Выставление номера радиостанции через прямое указание её номера
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation0() { // Выставление номера радиостанции через прямое указание её номера (граничное значение)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation10() { // Выставление номера радиостанции через прямое указание её номера (граничное значение)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // Увеличение громкости звука
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() { // Увеличение максимальной громкости звука
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() { // Уменьшение громкости звука
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceOtherVolume() { // Уменьшение громкости звука (введение иных данных)
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.reduceVolume();
        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() { // Уменьшение минимальной громкости звука
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.reduceMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinOtherVolume() { // Уменьшение минимальной громкости звука (введение иных данных)
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.reduceMinVolume();
        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
