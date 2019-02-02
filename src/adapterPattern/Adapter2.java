package adapterPattern;

/**
 * 适配器中的类适配器
 * @author jesse
 */
public class Adapter2  extends Adaptee implements Target{

    @Override
    public void methodA() {
        method("qwe");
    }

    @Override
    public void methodB() {
        method(null);
    }
}
