package factoryMethod;

import simpleFactory.ConcreteProductA;
import simpleFactory.Product;

public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}