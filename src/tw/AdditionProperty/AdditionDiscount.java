package tw.AdditionProperty;

import com.google.inject.Guice;
import com.google.inject.name.Named;
import tw.Property.DiscountProperty;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/19.
 */
public class AdditionDiscount extends AdditionProperty<Pair> {

//    public void AdditionDiscount(List<Pair> listPromotion, List<ShoppingItem> shoppingItems) {
//        super(listPromotion, shoppingItems);
//    }

    @Override
    @Named("AdditionDiscount")
    public void AddProperty(List<Pair> listPromotion, ShoppingItem shoppingItem) {
        DiscountProperty discountProperty = Guice.createInjector().getInstance(DiscountProperty.class);
        discountProperty.setShoppingItem(shoppingItem);
        discountProperty.setPromotion(listPromotion);
        shoppingItem.setPriceSum(discountProperty.getPromotionSum());

    }
}
