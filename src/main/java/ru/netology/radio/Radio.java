package ru.netology.radio;

public class Radio {


    public int radioChannel;

    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel < 0) {
            return;
        }
        if (newRadioChannel > 9) {
            return;
        }
        radioChannel = newRadioChannel;
    }

    public void nextChannel(int newNextChannel) {

        if (newNextChannel > 9) {
            radioChannel = 0;
        } else {
            radioChannel = newNextChannel + 1;
        }
    }

    public void setPrevChannel(int newPrevChannel) {

        if (newPrevChannel < radioChannel) {
            radioChannel = 9;
        } else {
            radioChannel = newPrevChannel - 1;
        }
    }

    //==============================================================================================
    public int radioVolume;

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < 0) {
            return;
        }
        if (newRadioVolume > 100) {
            return;
        }
        radioVolume = newRadioVolume;
    }

    public void increaseRadioVolume(int newRadioVolume) {
        if (newRadioVolume < 100) {
            radioVolume = newRadioVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseRadioVolume(int newRadioDecreaseVolume) {
        if (newRadioDecreaseVolume > 0) {
            radioVolume = newRadioDecreaseVolume - 1;
        } else {
            return;
        }
    }
}






