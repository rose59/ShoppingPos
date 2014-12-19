package tw.calculate;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;
import tw.shopping.ShoppingItem;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PromotionCalculateTest {

    private ShoppingItem shoppingItem;

    @Before
    public void setUp() throws Exception {
        shoppingItem = new ShoppingItem(new Item("item01", 20.0), 3);

    }

    @Test
    public void should_get_discountSum_when_given_promotion() throws Exception {
        PromotionCalculate promotionCalculate = new PromotionCalculate();
        assertThat(promotionCalculate.calculate(shoppingItem, 0.75), is(15.0));

    }
}