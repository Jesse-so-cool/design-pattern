package facadePattern;

import builderPattern.BenzBuilder;

/**
 * 可以不需要
 */
public interface Mechine {
    void start();

    void shutdown();

    public static void main(String[] args) {

         String we = new String("we");
         String we1 = new String("we");
        System.out.println(we == we1);

    }

}
