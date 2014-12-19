package tw.Property;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PropertyTest {

    private ShoppingItem shoppingItem;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 10.0), 2);
        shoppingItem.setPriceSum(20);

    }

    @Test
    public void should_get_promotionSum_when_given_shoppingItems() throws Exception {
        Property property = new Property(shoppingItem) {
            @Override
            double getPromotionSum() {
                return shoppingItem.getPriceSum();
            }
        };
        assertThat(property.getShoppingItem(),is(shoppingItem));
        assertThat(property.getPromotionSum(),is(20.0));

    }
}