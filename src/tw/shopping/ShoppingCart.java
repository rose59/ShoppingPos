package tw.shopping;

import com.google.inject.Inject;

import java.util.List;

/**
 * Created by 欣 on 2014/12/17.
 */
public class ShoppingCart {

    private List<ShoppingItem> shoppingItems;
    private double promotionSum;
    private double sum;
    @Inject
    public ShoppingCart(List<ShoppingItem> shoppingItems) {
        this.shoppingItems = shoppingItems;
    }

    public double calculatePromotionSum(double value) {
        for (ShoppingItem shoppingItem : shoppingItems) {
            this.promotionSum += shoppingItem.getPriceSum();
        }
        this.promotionSum-=(int)(this.promotionSum / 100) * value;
        return this.promotionSum ;
    }


    public double calculateSum() {
        for (ShoppingItem shoppingItem : shoppingItems) {
            sum += shoppingItem.getQuantity() * shoppingItem.getItem().getPrice();
        }
        return this.sum;
    }

    public List<ShoppingItem> getShoppingItems() {
        return shoppingItems;
    }

    public double getSum() {
        return sum;
    }

    public double getPromotionSum() {

        return promotionSum;
    }
}
