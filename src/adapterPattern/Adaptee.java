package adapterPattern;

public class Adaptee {
    public void method(String type){
        if (type != null){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
}
