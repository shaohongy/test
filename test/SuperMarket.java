package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shy
 * @create 2024-02-23 10:17
 * @description
 */
public class SuperMarket {
    private List<Fruit> fruits;

    public SuperMarket() {
        fruits = new ArrayList<>();
        fruits.add(new Apple(8.0));
        fruits.add(new Strawberry(13.0));
        fruits.add(new Mango(20.0));
    }

    public double getPriceCount(int appleWeight, int strawberryWeight, int mangoWeight, String type) {
        double total = 0.0;
        for (int i = 0; i < fruits.size(); i++) {
            if (i == 0) { //苹果
                total += fruits.get(i).getPriceCount(appleWeight);
            } else if (i == 1) { // 草莓
                switch (type) {
                    case "C":
                        total += fruits.get(i).getPriceCount(strawberryWeight) * 0.8;
                        break;
                    default:
                        total += fruits.get(i).getPriceCount(strawberryWeight);
                        break;
                }
            } else { //芒果
                total += fruits.get(i).getPriceCount(mangoWeight);
            }
        }

        return (total >= 100 ? total - 10 : total);
    }

}
