package singleton;

/**
 * 1.饿汉模式(太饿，初始化直接就实例化了)
 * 优点：简单快速，且不会有线程安全问题，一般来说使用饿汉式 已经非常好
 */
class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
