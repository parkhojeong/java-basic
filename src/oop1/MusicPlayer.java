package oop1;

public class MusicPlayer {
    boolean isOn = false;
    int volume = 0;

    public void on() {
        System.out.println("Turning on the music player...");
        isOn = true;
    }

    public void off() {
        System.out.println("Turning off the music player...");
        isOn = false;
    }

    public void volumeUp() {
        volume++;
        printVolume();
    }

    public void volumeDown() {
        volume--;
        printVolume();
    }

    public void printVolume() {
        System.out.println("volume: " + volume);
    }

    public void getStats() {
        System.out.println("isOn: " + isOn + ", volume: " + volume);
    }
}
