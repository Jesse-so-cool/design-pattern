package singleton;

/**
 * 懒汉式（太懒，等到调用才实例化）
 * 优点：节省资源，必须double-check才可以没有线程安全问题
 */
class LazySingleton {
    /**
     * JVM内存模型：主内存和线程独立的工作内存
     * Java内存模型规定，对于多个线程共享的变量，存储在主内存当中，
     * 每个线程都有自己独立的工作内存（比如CPU的寄存器），线程只能访问自己的工作内存，
     * 不可以访问其它线程的工作内存。
     */

    /**
     * volatile关键字保证变量修改的可见性（volatile保证可见性的原理是在每次访问变量时都会进行一次刷新），
     * 还有另一个重要的作用：在JDK1.5之后，可以使用volatile变量禁止指令重排序。
     *
     */
     private volatile static LazySingleton instance = null;

    private LazySingleton() { }

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    /**
                     * new LazySingleton()
                     * 看似简单的一段赋值语句：instance= new LazySingleton()，但是很不幸它并不是一个原子操作，
                     * 其实际上可以抽象为下面几条JVM指令：
                     *
                     * 1 memory =allocate();    //1：分配对象的内存空间
                     * 2 ctorInstance(memory);  //2：初始化对象
                     * 3 instance =memory;     //3：设置instance指向刚分配的内存地址
                     * 上面操作2依赖于操作1，但是操作3并不依赖于操作2，所以JVM是可以针对它们进行指令的优化重排序的，经过重排序后如下：
                     *
                     * 1 memory =allocate();    //1：分配对象的内存空间
                     * 2 instance =memory;     //3：instance指向刚分配的内存地址，此时对象还未初始化
                     * 3 ctorInstance(memory);  //2：初始化对象
                     * 可以看到指令重排之后，instance指向分配好的内存放在了前面，而这段内存的初始化被排在了后面。
                     *
                     * 在线程A执行这段赋值语句，在初始化分配对象之前就已经将其赋值给instance引用，
                     * 恰好另一个线程进入方法判断instance引用不为null，然后就将其返回使用，导致出错。
                     *
                     * 所以加上volatile后 可以避免这种情况
                     */
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
