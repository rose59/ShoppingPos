package tw.AdditionProperty;

import tw.Property.QuantityProperty;
import tw.item.Item;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.List;
import java.util.Map;

/**
 * Created by 欣 on 2014/12/19.
 */
public class AdditionShoppingItem {
    private List<ShoppingItem> shoppingItems;
    private Map<String, Integer> map;

    public AdditionShoppingItem(List<ShoppingItem> itemList) {
        this.shoppingItems = itemList;
    }

    public void setMap(Map<String, Integer> map, List<Pair> pairs) {
        QuantityProperty quantityProperty = new QuantityProperty(pairs);
        this.map = quantityProperty.getMap();
        map = this.map;
    }

    public void setShoppingItems(List<Pair> pairs) {
        for (Pair pair : pairs) {
            ShoppingItem shoppingItem = new ShoppingItem(new Item(pair.getName(), pair.getValue()), this.map.get(pair.getName()));
            shoppingItems.add(shoppingItem);
        }

    }
}
