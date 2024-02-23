package test;

/**
 * @author shy
 * @create 2024-02-23 10:18
 * @description
 */
public class TestMain {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        System.out.println("A : " + superMarket.getPriceCount(2, 4, 0, "A"));
        System.out.println("B : " + superMarket.getPriceCount(3, 2, 0, "B"));
        System.out.println("C : " + superMarket.getPriceCount(5, 4, 3, "C"));
        System.out.println("D : " + superMarket.getPriceCount(5, 4, 6, "D"));


    }
}
