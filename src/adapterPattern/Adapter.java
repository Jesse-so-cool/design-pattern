package adapterPattern;

/**
 * 适配器中的对象适配器，较为常用
 *
 *
 * 把一个类的接口变换成客户端所期待的另一种接口
 *
 *
 ● Target（目标抽象类）：目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
 ● Adapter（适配器类）：适配器可以调用另一个接口，作为一个转换器，
   对Adaptee和Target进行适配，适配器类是适配器模式的核心，在对象适配器中，
   它通过继承Target并关联一个Adaptee对象使二者产生联系。
 ● Adaptee（适配者类）：适配者即被适配的角色，它定义了一个已经存在的接口，
   这个接口需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，
   在某些情况下可能没有适配者类的源代码。
 *
 * 优点
 *
 * 1、有更好的复用性。系统需要使用现有的类，但此类接口不符合系统需要，通过适配器模式让这些功能得到很好的复用
 *
 * 2、有更好的扩展性。实现适配器，可以调用自己开发的功能
 *
 * 缺点
 *
 * 过多使用适配器会使得系统非常凌乱，明明调用的是A接口，内部却被适配成了B接口。因此除非必要，不推荐使用适配器，而是直接对系统重构
 */
public class Adapter implements Target{
    Adaptee adaptee;
    @Override
    public void methodA() {
        adaptee.method("qwe");
    }

    @Override
    public void methodB() {
        adaptee.method(null);
    }
}
