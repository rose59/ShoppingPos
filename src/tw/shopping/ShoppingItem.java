package tw.shopping;

import tw.item.Item;

/**
 * Created by 欣 on 2014/12/17.
 */
public class ShoppingItem {
    private Item item;
    private int quantity;
    private double priceSum;

    public ShoppingItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void setPriceSum(double priceSum) {

        this.priceSum = priceSum;
    }

    public double getPriceSum() {
        return priceSum;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
