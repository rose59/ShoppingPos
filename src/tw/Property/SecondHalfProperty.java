package tw.Property;

import tw.calculate.SecondHalfCalculate;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/18.
 */
public class SecondHalfProperty extends Property {
    double secondHalf;

    public SecondHalfProperty(ShoppingItem shoppingItem) {
        super(shoppingItem);
    }

    public void setSecondHalf(List<String> list) {
        this.secondHalf = 1.0;
        for (String str : list) if (str.equals(this.getShoppingItem().getItem().getName())) this.secondHalf = 0.5;
    }

    @Override
    public double getPromotionSum() {
        return new SecondHalfCalculate().calculate(this.getShoppingItem(), this.secondHalf);
    }
}
