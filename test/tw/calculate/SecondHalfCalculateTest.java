package tw.calculate;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SecondHalfCalculateTest {

    private ShoppingItem shoppingItem;

    @Before
    public void setUp() throws Exception {
        this.shoppingItem = new ShoppingItem(new Item("item01", 10.0), 3);
        ShoppingItem shoppingItem = this.shoppingItem;
        shoppingItem.setPriceSum(10);

    }

    @Test
    public void should_get_discountSum_when_given_SecondHalf() throws Exception {
        SecondHalfCalculate secondHalfCalculate = new SecondHalfCalculate();
        assertThat(secondHalfCalculate.calculate(shoppingItem, 0.5), is(25.0));

    }
}