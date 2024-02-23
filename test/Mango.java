package test;

/**
 * @author shy
 * @create 2024-02-23 10:17
 * @description
 */
// 芒果 20
public class Mango extends Fruit {
    public Mango(double price) {
        super(price);
    }

    @Override
    public double getPriceCount(int weight) {
        return weight * getPrice();
    }
}
