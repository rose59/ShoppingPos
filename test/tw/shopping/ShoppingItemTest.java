package tw.shopping;

import org.junit.Test;
import tw.item.Item;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShoppingItemTest {


    @Test
    public void should_get_shoppingItem_when_given_item_and_quantity() throws Exception {

        Item item = new Item("item01", 10.0);
        ShoppingItem shoppingItem = new ShoppingItem(item, 2);
        assertThat(shoppingItem.getItem(),is(item));
        assertThat(shoppingItem.getQuantity(),is(2));


    }
}