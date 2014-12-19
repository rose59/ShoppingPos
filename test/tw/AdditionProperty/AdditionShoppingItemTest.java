package tw.AdditionProperty;

import org.junit.Before;
import org.junit.Test;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionShoppingItemTest {

    private List<ShoppingItem> itemList = new ArrayList<ShoppingItem>();
    private Map<String, Integer> map = new HashMap<String, Integer>();
    private ArrayList<Pair> listQuantity;
    private ArrayList<Pair> listItems;

    @Before
    public void setUp() throws Exception {
        // ShoppingItem shoppingItem ;
        listQuantity = new ArrayList<Pair>();
        listQuantity.add(new Pair("item01", 2));
        listItems = new ArrayList<Pair>();
        listItems.add(new Pair("item01", 10));

    }

    @Test
    public void should_get_shoppingItemList_when_given_items_and_quantity() throws Exception {
        AdditionShoppingItem additionShoppingItem = new AdditionShoppingItem(itemList);
        additionShoppingItem.setMap(map, listQuantity);
        additionShoppingItem.setShoppingItems(listItems);
        assertThat(itemList.get(0).getItem().getName(), is("item01"));
        assertThat(itemList.get(0).getItem().getPrice(), is(10.0));
        assertThat(itemList.get(0).getQuantity(), is(2));

    }
}