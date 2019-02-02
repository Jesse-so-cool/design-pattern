package bridgePattern;

public class BMWCar extends Car {
    @Override
    public void run() {
        System.out.println("bmw is runing! transmission is ");
        gear.gear();
    }
}
