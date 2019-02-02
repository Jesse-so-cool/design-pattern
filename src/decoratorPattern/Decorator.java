package decoratorPattern;

/**
 * 装饰模式(Decorator Pattern)：动态地给一个对象增加一些额外的职责，就增加对象功能来说，
 * 装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
 *
 * 它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。
 * 它维护一个指向抽象构件对象的引用，
 * 通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 */
public class Decorator extends Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void show() {
        component.show();
    }

    public static void main(String[] args) {
        Component a,b,c;
        a = new People();
        b = new RapDecorator(a);
        c = new SingDecorator(b);
        c.show();
    }
}
