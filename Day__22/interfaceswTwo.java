class Phone {
    void call() {
        System.out.println("Call.");

    }

    void sms() {
        System.out.println("Sms.");
    }

}

interface ICamera {

    void click();

    void record();

}

interface IMusicPlayer {

    void play();

    void stop();

}

class Smartphone extends Phone implements ICamera, IMusicPlayer {

    public void videoCall() {
        System.out.println("Video Call.");
    }

    public void click() {
        System.out.println("Photo Clicked.");
    }

    public void record() {
        System.out.println("Recording Started.");
    }

    public void play() {
        System.out.println("Video Playing.");
    }

    public void stop() {
        System.out.println("Video Stopped.");
    }

}

public class interfaceswTwo {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();
        s.call();
        s.click();
        s.play();
        s.record();
        s.sms();
        s.stop();

    }

}
