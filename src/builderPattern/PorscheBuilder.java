package builderPattern;

public class PorscheBuilder extends Builder{
    @Override
    public void buildPartA() {
        System.out.println("build零件A");
    }

    @Override
    public void buildPartB() {
        System.out.println("build零件B");

    }

    @Override
    public void buildPartC() {
        System.out.println("build零件C");

    }
}
