package tw.item;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {

    @Test
    public void should_get_item_when_given_name_and_price() throws Exception {
        Item item = new Item("item01", 10.0);
        assertThat(item.getName(),is("item01"));
        assertThat(item.getPrice(),is(10.0));
    }
}