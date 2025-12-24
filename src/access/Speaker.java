package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("Volume is full");
            return;
        }

        volume+= 10;
        System.out.println("Speaker.volumeUp");
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("Speaker.volumeDown");
    }

    void showVolume() {
        System.out.println("Speaker.volume: " + volume);
    }
}
