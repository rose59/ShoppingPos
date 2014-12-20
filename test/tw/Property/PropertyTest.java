package tw.Property;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PropertyTest {

    private ShoppingItem shoppingItem;
    //Property property;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 10.0), 2);
        shoppingItem.setPriceSum(20);

    }

    @Test
    public void should_get_promotionSum_when_given_shoppingItems() throws Exception {

//         property=spy(property);
//        when(property.getPromotionSum()).thenReturn(shoppingItem.getPriceSum());


        Property property = new Property() {

            @Override
            double getPromotionSum() {
                return shoppingItem.getPriceSum();
            }
        };
        property.setShoppingItem(shoppingItem);
        assertThat(property.getShoppingItem(), is(shoppingItem));
        assertThat(property.getPromotionSum(), is(20.0));

    }
}