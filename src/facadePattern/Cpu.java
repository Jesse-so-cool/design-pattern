package facadePattern;

public class Cpu implements Mechine{
    @Override
    public void start() {
        System.out.println("cpu start!");
    }

    @Override
    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}
