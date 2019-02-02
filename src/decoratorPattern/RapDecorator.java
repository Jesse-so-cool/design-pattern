package decoratorPattern;

public class RapDecorator extends Decorator {
    public RapDecorator(Component component) {
        super(component);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("i can rap");
    }
}
