package tw.AdditionProperty;

import com.google.inject.name.Named;
import tw.Property.SecondHalfProperty;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/19.
 */
public class AdditionSecondHalf extends AdditionProperty<String> {
//    public AdditionSecondHalf(List<String> listPromotion, List<ShoppingItem> shoppingItems) {
//        super(listPromotion, shoppingItems);
//    }

    @Override
    @Named("AdditionSecondHalf")
    public void AddProperty(List<String> list, ShoppingItem shoppingItem) {
        SecondHalfProperty secondHalfProperty = new SecondHalfProperty(shoppingItem);
        secondHalfProperty.setSecondHalf(list);
        shoppingItem.setPriceSum(secondHalfProperty.getPromotionSum());

    }
}
