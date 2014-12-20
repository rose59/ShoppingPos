package tw.AdditionProperty;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionSecondHalfTest {

    private ArrayList<String> list;
    private ArrayList<ShoppingItem> shoppingItems;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("item01");
        shoppingItems = new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01", 10.0), 2));
        shoppingItems.get(0).setPriceSum(10);

    }

    @Test
    public void should_get_DiscountSum_after_when_add_given_secondHalfProperty_list() throws Exception {
        Guice.createInjector().getInstance(AdditionSecondHalf.class).AdditionProperty(list, shoppingItems);
        assertThat(shoppingItems.get(0).getPriceSum(), is(15.0));

    }
}