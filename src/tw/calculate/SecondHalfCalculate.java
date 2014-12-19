package tw.calculate;

import tw.shopping.ShoppingItem;

/**
 * Created by 欣 on 2014/12/17.
 */
public class SecondHalfCalculate implements Calculate {
    @Override
    public double calculate(ShoppingItem shoppingItem, double value) {
        double promotionSum = shoppingItem.getPriceSum() * ((shoppingItem.getQuantity() / 2) * (value + 1.0) + shoppingItem.getQuantity() % 2);
        return promotionSum;
    }
}
