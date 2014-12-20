package tw.shopping;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.item.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShoppingCartTest {

    private List<ShoppingItem> shoppingItems;
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() throws Exception {
        shoppingItems = new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01", 10.0), 3));
        shoppingItems.add(new ShoppingItem(new Item("item02", 20.0), 2));
        shoppingCart = Guice.createInjector().getInstance(ShoppingCart.class);
        shoppingCart.setShoppingItems(shoppingItems);

    }

    @Test
    public void should_get_promotionSum_when_given_shoppingItems() throws Exception {

        assertThat(shoppingCart.calculatePromotionSum(10), is(0.0));
    }

    @Test
    public void should_get_sum_when_given_shoppingItems() throws Exception {

        assertThat(shoppingCart.calculateSum(), is(70.0));

    }
}