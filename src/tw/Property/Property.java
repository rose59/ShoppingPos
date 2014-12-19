package tw.Property;

import tw.shopping.ShoppingItem;

/**
 * Created by 欣 on 2014/12/18.
 */
public abstract class Property {
    private ShoppingItem shoppingItem;

    public Property(ShoppingItem shoppingItem) {
        this.shoppingItem = shoppingItem;
    }

    public ShoppingItem getShoppingItem() {
        return shoppingItem;
    }

    abstract double getPromotionSum();
}
