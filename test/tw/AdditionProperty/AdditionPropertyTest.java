package tw.AdditionProperty;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionPropertyTest {

    private ArrayList<String> list;
    private ArrayList<ShoppingItem> shoppingItems;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("item01");
        shoppingItems = new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01",10.0),2));

    }

    @Test
    public void should_get_property_when_given_shoppingItem_property() throws Exception {
        AdditionProperty stringAdditionProperty = new AdditionProperty() {
            @Override
            public void AddProperty(List list, ShoppingItem shoppingItem) {
                shoppingItem.setPriceSum(list.size());
            }
        };
        stringAdditionProperty.AdditionProperty(list,shoppingItems);
        assertThat(shoppingItems.get(0).getPriceSum(),is(1.0));

    }
}