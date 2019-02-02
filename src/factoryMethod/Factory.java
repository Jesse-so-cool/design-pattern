package factoryMethod;

import simpleFactory.Product;

/**
 * 工厂方法模式是使用频率最高的设计模式之一，是很多开源框架和API类库的核心模式。
 * 每个工厂管理自己的产品
 *
 * 工厂方法模式的主要优点如下：
 * (1) 在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产品类将被实例化这一细节，用户只需要关心所需产品对应的工厂，无须关心创建细节，甚至无须知道具体产品类的类名。
 * (2) 基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。它能够让工厂可以自主确定创建何种产品对象，而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式之所以又被称为多态工厂模式，就正是因为所有的具体工厂类都具有同一抽象父类。
 * (3) 使用工厂方法模式的另一个优点是在系统中加入新产品时，无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，而只要添加一个具体工厂和具体产品就可以了，这样，系统的可扩展性也就变得非常好，完全符合“开闭原则”。
 *
 * 开闭原则(Open-Closed Principle, OCP)：
 * 一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展。
 */
public interface Factory {
    public Product factoryMethod();

    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreteFactory(); //可通过配置文件实现
        Product product;
        product = factory.factoryMethod();
        product.methodSame();
    }
}
