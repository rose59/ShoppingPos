package tw.Property;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.parser.Pair;
import tw.shopping.ShoppingItem;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiscountPropertyTest {

    private ShoppingItem shoppingItem;
    private List<Pair> pairs;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 10.0), 2);
        pairs = new ArrayList<Pair>();
        pairs.add(new Pair("item01", 75));

    }

    @Test
    public void should_get_promotionSum_when_given_discount() throws Exception {
        DiscountProperty discountProperty = new DiscountProperty(shoppingItem);
        discountProperty.setPromotion(pairs);
        assertThat(discountProperty.getPromotionSum(), is(7.5));
    }
}