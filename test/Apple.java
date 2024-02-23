package test;

/**
 * @author shy
 * @create 2024-02-23 10:17
 * @description
 */
// 苹果类 8
class Apple extends Fruit {

    public Apple(double price) {
        super(price);
    }

    @Override
    public double getPriceCount(int weight) {
        return weight * getPrice();
    }
}
