package tw.Property;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SecondHalfPropertyTest {

    private ShoppingItem shoppingItem;
    private ArrayList<String> list;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 10.0), 2);
        shoppingItem.setPriceSum(10);
        list = new ArrayList<String>();
        list.add("item01");


    }

    @Test
    public void should_get_PromotionSum_when_given_SecondHalfProperty() throws Exception {
        SecondHalfProperty secondHalfProperty = Guice.createInjector().getInstance(SecondHalfProperty.class);
        secondHalfProperty.setShoppingItem(shoppingItem);
        secondHalfProperty.setSecondHalf(list);
        assertThat(secondHalfProperty.getPromotionSum(), is(15.0));
    }
}