package abstractFactory;


/**
 * 抽象工厂模式的主要优点如下：
 * (1) 抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建。
 *     由于这种隔离，更换一个具体工厂就变得相对容易，所有的具体工厂都实现了抽象工厂中定义的那些公共接口，因此只需改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为。
 * (2) 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。
 * (3) 增加新的产品族很方便，无须修改已有系统，符合“开闭原则”。
 *
 * 缺点：
 * 增加新的产品等级结构麻烦，需要对原有系统进行较大的修改，
 * 甚至需要修改抽象层代码，这显然会带来较大的不便，违背了“开闭原则”。
 *
 * 使用：
 * 在Java语言的AWT（抽象窗口工具包）中就使用了抽象工厂模式
 * 类似这个demo
 *
 * demo中button textField comboBox是一个产品族
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();

    static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = new SpringSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
