package facadePattern;


/**
 * 外观模式
 *
 * 门面类Facade
 *
 * 它通过引入一个外观角色来简化客户端与子系统之间的交互，为复杂的子系统调用提供一个统一的入口
 * 感觉就是简单的封装
 */
public class Computer implements Mechine{
    private Cpu cpu;

    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
    }


    @Override
    public void start() {
        cpu.start();
        disk.start();
    }

    @Override
    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
    }

    public static void main(String[] args) {
        new Computer().start();
    }
}
