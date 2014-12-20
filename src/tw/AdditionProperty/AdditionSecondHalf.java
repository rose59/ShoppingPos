package tw.AdditionProperty;

import com.google.inject.Guice;
import com.google.inject.name.Named;
import tw.Property.SecondHalfProperty;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/19.
 */
public class AdditionSecondHalf extends AdditionProperty<String> {

    @Override
    @Named("AdditionSecondHalf")
    public void AddProperty(List<String> list, ShoppingItem shoppingItem) {
        SecondHalfProperty secondHalfProperty = Guice.createInjector().getInstance(SecondHalfProperty.class);
        secondHalfProperty.setShoppingItem(shoppingItem);
        secondHalfProperty.setSecondHalf(list);
        shoppingItem.setPriceSum(secondHalfProperty.getPromotionSum());

    }
}
