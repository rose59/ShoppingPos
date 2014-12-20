package tw.AdditionProperty;

import com.google.inject.Guice;
import tw.Property.QuantityProperty;
import tw.item.Item;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.List;
import java.util.Map;

/**
 * Created by 欣 on 2014/12/19.
 */
public class InitShoppingItem {
    private List<ShoppingItem> shoppingItems;
    private Map<String, Integer> map;

    private void setQuantityMap(List<Pair> pairs) {
        QuantityProperty quantityProperty = Guice.createInjector().getInstance(QuantityProperty.class);
        quantityProperty.setQuantityProperty(pairs);
        this.map = quantityProperty.getMap();
    }

    public void setShoppingItems(List<ShoppingItem> shoppingItems, List<Pair> pairItems, List<Pair> pairQuantity) {
        setQuantityMap(pairQuantity);
        this.shoppingItems = shoppingItems;
        for (Pair pair : pairItems) {
            shoppingItems.add(new ShoppingItem(new Item(pair.getName(), pair.getValue()), this.map.get(pair.getName())));
        }

    }
}
