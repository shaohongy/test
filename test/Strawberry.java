package test;

/**
 * @author shy
 * @create 2024-02-23 10:17
 * @description
 */
// 草莓类 13
public class Strawberry extends Fruit {
    public Strawberry(double price) {
        super(price);
    }

    @Override
    public double getPriceCount(int weight) {
        return weight * getPrice();
    }
}
