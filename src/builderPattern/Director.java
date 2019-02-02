package builderPattern;


/**
 * 建造者模式和抽象工厂模式的区别
 * 在抽象工厂样式中，每一次工厂对象被呼叫时都会传回一个完整的产品对象，
 * 而使用端有可能会决定把这些产品组装成一个更大的和复杂的产品，也有可能不会。
 * 工厂对象是没有状态的，不知道上一次构建的是哪一个产品，也没有未来的概念，
 * 不知道下一次构建的是哪一个产品，更不知道自己构建的产品在更高层的产品结构蓝图中是什么位置。
 *
 * 建造类别则不同，建造样式的重点在导演者角色。导演者对象是有状态的，
 * 它知道整体蓝图，知道上一次、这一次和下一次交给建造者角色去构建的零件是什么，
 * 以便能够将这些零件组装成为一个更大规模的产品。它一点一点地建造出一个复杂的产品，
 * 而这个产品的组装程序就发生在导演者角色内部。建造者样式的使用端拿到的是一个完整的最后产品。
 *
 * 自己理解:
 * 抽象工厂先制造出的一个工厂，想要陆续打造什么产品，全都自己控制
 * 建造者模式一般会有个director限制整个build的顺序，打造一整个完整的产品，例如车
 */
public class Director {
    private  Builder builder;

    public  Director(Builder builder) {
        this.builder=builder;
    }

    public  void setBuilder(Builder builder) {
        this.builder=builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

    public static void main(String[] args) {
        Director director = new Director(new PorscheBuilder());
        director.construct();
    }
}
