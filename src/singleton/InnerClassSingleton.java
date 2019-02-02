package singleton;

/**
 * Initialization on Demand Holder
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；
 * 懒汉式单例类线程安全控制烦琐，而且性能受影响
 * 有没有一种方法，能够将两种单例的缺点都克服，而将两者的优点合二为一呢？答案是：Yes！
 * 静态内部类实现单例的方法
 */
class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    /**
     * 利用了静态内部类，只在被调用时才加载的特性
     */
    private static class HolderClass {
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return HolderClass.instance;
    }

}

