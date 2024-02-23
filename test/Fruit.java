package test;

/**
 * @author shy
 * @create 2024-02-23 10:15
 * @description
 */
abstract class Fruit {
    // 价格
    private double price;

    public Fruit(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // 总价
    public abstract double getPriceCount(int weight);
}
