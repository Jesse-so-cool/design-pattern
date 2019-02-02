package facadePattern;

public class Disk implements Mechine{
    @Override
    public void start() {
        System.out.println("Disk start!");
    }

    @Override
    public void shutdown() {
        System.out.println("Disk shutdown!");
    }
}
