package tw.AdditionProperty;

import com.google.inject.Guice;
import com.google.inject.name.Named;
import tw.Property.FullCutProperty;
import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/19.
 */
public class AdditionFullCut extends AdditionProperty<String> {

    @Override
    @Named("AdditionFullCut")
    public void AddProperty(List<String> list, ShoppingItem shoppingItem) {
        FullCutProperty fullCutProperty = Guice.createInjector().getInstance(FullCutProperty.class);
        fullCutProperty.setShoppingItem(shoppingItem);
        fullCutProperty.setFullCut(list);
        shoppingItem.setPriceSum(fullCutProperty.getPromotionSum());

    }
}
