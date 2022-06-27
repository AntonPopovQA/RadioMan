package ru.netology.RadioMan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тестирование переключения радиостанций
    Radio radio = new Radio();

    // Тестирование переключения радиостанций
    @Test
    public void shouldSetCurrentRadioStation() { // Выставление номера радиостанции через прямое указание её номера
        radio.setCurrentRadioStation(6);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() { // Переключение на следующую радиостанцию
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() { // Переключение на предыдущую радиостанцию
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxRadioStation() { // Переключение с предпоследней на последнюю (граничное значение)
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinRadioStation() { // Переключение на первую радиостанцию (граничное значение)
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNextAfter9() { // Переключение на следующую радиостанцию после последней (9)
        radio.setCurrentRadioStation(9);
        radio.increaseMaxRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationPrevBefore0() { // Переключение на предыдущую радиостанцию перед первой (0)
        radio.setCurrentRadioStation(0);
        radio.reduceRadioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование переключения радиостанций в случае когда при создании объекта задается количество радиостанций (12)
    @Test
    public void shouldIncreaseRadioStationNext() { // Переключение на следующую радиостанцию после последней (11)
        Radio radio = new Radio(12);
        radio.setCurrentRadioStation(12);
        radio.increaseMaxRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxRadioStationNewAmount() { // Переключение c средпоследней на последнюю (граничное значение)
        Radio radio = new Radio(12);
        radio.setCurrentRadioStation(10);
        radio.increaseRadioStation();
        int expected = 11;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationPrevBefore() { // Переключение на предыдущую радиостанцию перед первой (0)
        Radio radio = new Radio(12);
        radio.setCurrentRadioStation(0);
        radio.reduceRadioStationPrev();
        int expected = 11;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinRadioStationNewAmount() { // Переключение на первую радиостанцию (граничное значение)
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNewAmount() { // Переключение на следующую радиостанцию
        Radio radio = new Radio(12);
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNewAmount() { // Переключение на предыдущую радиостанцию
        Radio radio = new Radio(12);
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование радиостанций для 100% покрытия по бранчам
    @Test
    public void shouldReduceLastOtherRadioStation() { // Выход из сеттера
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOtherRadioStation() { // Выход из сеттера
        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationOther() { // Переключение радиостанции (введение иных данных)
        radio.setCurrentRadioStation(10);
        radio.increaseRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxRadioStationOther() { // Переключение радиостанции (введение иных данных)
        radio.setCurrentRadioStation(8);
        radio.increaseMaxRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationOther() { // Переключение радиостанции (введение иных данных)
        radio.setCurrentRadioStation(10);
        radio.decreaseRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationOther() { // Переключение радиостанции (введение иных данных)
        radio.setCurrentRadioStation(1);
        radio.reduceRadioStationPrev();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование громкости звука
    @Test
    public void shouldIncreaseVolume() { // Увеличение громкости звука
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() { //Переключение на максимальную громкость (граничное значение)
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolumeNext() { // Увеличение максимальной громкости звука
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() { // Уменьшение громкости звука
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() { // Переключение на минимальную громкость (граничное значение)
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolumeNext() { // Уменьшение минимальной громкости звука
        radio.setCurrentVolume(0);
        radio.reduceMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование громкости звука для 100% покрытия по бранчам
    @Test
    public void shouldReduceOtherVolume() { // Уменьшение громкости звука (введение иных данных)
        radio.setCurrentVolume(101);
        radio.reduceVolume();
        int expected = 101;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinOtherVolume() { // Уменьшение минимальной громкости звука (введение иных данных)
        radio.setCurrentVolume(-1);
        radio.reduceMinVolume();
        int expected = -1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
