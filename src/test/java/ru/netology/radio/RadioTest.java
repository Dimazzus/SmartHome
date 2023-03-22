package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioChannel() {
        Radio radio = new Radio();
        radio.setRadioChannel(5);
        int expected = 5;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetAboveMaxChannel() {
        Radio radio = new Radio();
        radio.setRadioChannel(10);
        int expected = 0;
        int actual = radio.radioChannel;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinChannel() {
        Radio radio = new Radio();
        radio.setRadioChannel(-1);
        int expected = 0;
        int actual = radio.radioChannel;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelOverLimit() {
        Radio radio = new Radio();
        radio.nextChannel(10);
        int expected = 0;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChannel() {
        Radio radio = new Radio();
        radio.nextChannel(8);
        int expected = 9;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetChannelUnderLimit() {
        Radio radio = new Radio();
        radio.setPrevChannel(-1);
        int expected = 9;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel() {
        Radio radio = new Radio();
        radio.setPrevChannel(6);
        int expected = 5;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    //==============================================================================================
    @Test
    public void shouldSetRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioVolume(50);
        int expected = 50;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetOverload() {
        Radio radio = new Radio();
        radio.setRadioVolume(101);
        int expected = 0;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderLoad() {
        Radio radio = new Radio();
        radio.setRadioVolume(-1);
        int expected = 0;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolume() {
        Radio radio = new Radio();
        radio.increaseRadioVolume(0);
        int expected = 1;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseRadioVolume(101);
        int expected = 0;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseRadioVolume(1);
        int expected = 0;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseRadioVolume(-1);
        int expected = 0;
        int actual = radio.radioVolume;
        Assertions.assertEquals(expected, actual);
    }
}
