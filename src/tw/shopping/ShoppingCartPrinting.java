package tw.shopping;

import com.google.inject.Inject;

/**
 * Created by 欣 on 2014/12/19.
 */
public class ShoppingCartPrinting {
    private ShoppingCart shoppingCart;
    @Inject
    public ShoppingCartPrinting(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double calculateDifference() {
        return shoppingCart.getSum() - shoppingCart.getPromotionSum();
    }

    public boolean printCart(double value) {
        System.out.println("购物明细" + " " + "(数量" + " " + "单价" + " " + "小计）");
        for (ShoppingItem shoppingItem : shoppingCart.getShoppingItems()) {
            System.out.println(shoppingItem.getItem().getName() + "  " + shoppingItem.getQuantity() + "  " + shoppingItem.getItem().getPrice() + "   " + shoppingItem.getPriceSum());
        }
        shoppingCart.calculatePromotionSum(value);
        shoppingCart.calculateSum();
        System.out.println("总计金额" + " " + "(优惠前" + " " + "优惠后" + " " + "优惠差价）");
        System.out.println(shoppingCart.getPromotionSum() + "    " + shoppingCart.getSum() + "    " + shoppingCart.getPromotionSum() + "   " + calculateDifference());
        return true;

    }
}
