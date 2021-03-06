package bridgePattern;

/**
 * 桥接模式:
 * 是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维度，
 * 通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”。
 * 与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，
 * 并且在抽象层建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。
 *
 * 如UML图中，有一个聚合线，像一座桥(左右分别是Car和Transmission)，所以叫“桥接模式”。
 */
public class Client {
    public static void main(String[] args) {
        Transmission auto = new Auto();
        Car bmw = new BMWCar();
        bmw.setTransmission(auto);
        bmw.run();
    }
}
