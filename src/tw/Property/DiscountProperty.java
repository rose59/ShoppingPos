package tw.Property;

import tw.calculate.PromotionCalculate;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/18.
 */
public class DiscountProperty extends Property {
    private double promotion;

    public DiscountProperty(ShoppingItem shoppingItem) {
        super(shoppingItem);
    }

    public void setPromotion(List<Pair> pairs) {
        this.promotion = 1.0;
        for (Pair pair : pairs) {
            if (pair.getName().equals(this.getShoppingItem().getItem().getName())) {
                this.promotion = pair.getValue().doubleValue() / 100.0;
            }
        }
    }

    public double getPromotion() {
        return promotion;
    }

    @Override
    public double getPromotionSum() {

        return new PromotionCalculate().calculate(this.getShoppingItem(), this.promotion);
    }
}
