package This_Is_Java.ch08.sec02;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }
}
