package decoratorPattern;

public class SingDecorator extends Decorator {
    public SingDecorator(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("i can sing");
    }
}
