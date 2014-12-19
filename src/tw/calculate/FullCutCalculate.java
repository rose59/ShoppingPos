package tw.calculate;

import tw.shopping.ShoppingItem;

/**
 * Created by 欣 on 2014/12/18.
 */
public class FullCutCalculate implements Calculate {

    @Override
    public double calculate(ShoppingItem shoppingItem, double value) {
        return shoppingItem.getPriceSum()-(int)(shoppingItem.getPriceSum()/100)*value;
    }
}
