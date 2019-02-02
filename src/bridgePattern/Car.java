package bridgePattern;

public abstract class Car {
    Transmission gear = null;

    public  void setTransmission(Transmission gear) {
        this.gear = gear;
    }

    public abstract void run();
}
