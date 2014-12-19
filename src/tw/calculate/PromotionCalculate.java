package tw.calculate;

import tw.shopping.ShoppingItem;

/**
 * Created by 欣 on 2014/12/17.
 */
public class PromotionCalculate implements Calculate {
    @Override
    public double calculate(ShoppingItem shoppingItem, double value) {
        double promotionSum = shoppingItem.getItem().getPrice() * value;
        return promotionSum;
    }
}
