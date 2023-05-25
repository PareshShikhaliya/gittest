package class11;

// Interface representing the TV remote control
interface RemoteControl {
    void powerOn();
    void powerOff();
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();
}

// Concrete implementation of the TV remote control
class TelevisionRemoteControl implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV turned off");
    }

    @Override
    public void channelUp() {
        System.out.println("Channel increased");
    }

    @Override
    public void channelDown() {
        System.out.println("Channel decreased");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume increased");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume decreased");
    }
}

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new TelevisionRemoteControl();

        remoteControl.powerOn();
        remoteControl.channelUp();
        remoteControl.volumeUp();
        remoteControl.channelDown();
        remoteControl.volumeDown();
        remoteControl.powerOff();
    }
}
