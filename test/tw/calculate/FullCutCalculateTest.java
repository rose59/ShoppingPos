package tw.calculate;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FullCutCalculateTest {

    private ShoppingItem shoppingItem;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 100.0), 2);
        shoppingItem.setPriceSum(200.0);

    }

    @Test
    public void should_get_DiscountSum_when_given_FullCutValue() throws Exception {
        FullCutCalculate fullCutCalculate = Guice.createInjector().getInstance(FullCutCalculate.class);
        assertThat(fullCutCalculate.calculate(shoppingItem, 5.0), is(190.0));

    }
}