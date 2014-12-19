package tw.shopping;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShoppingCartTest {

    private List<ShoppingItem> shoppingItems;

    @Before
    public void setUp() throws Exception {
        shoppingItems=new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01",10.0),3));
        shoppingItems.add(new ShoppingItem(new Item("item02",20.0),2));

    }

    @Test
    public void should_get_promotionSum_when_given_shoppingItems() throws Exception {
        double promotionSum = new ShoppingCart(shoppingItems).calculatePromotionSum(10);
        assertThat(promotionSum,is(0.0));
    }

    @Test
    public void should_get_sum_when_given_shoppingItems() throws Exception {
        double sum = new ShoppingCart(shoppingItems).calculateSum();
        assertThat(sum,is(70.0));

    }
}