package tw.calculate;

import org.junit.Test;
import tw.shopping.ShoppingItem;

public class CalculateTest {

    @Test
    public void should_get_sum_when_given_value() throws Exception {
        new Calculate() {
            @Override
            public double calculate(ShoppingItem shoppingItem, double value) {
                return shoppingItem.getPriceSum();
            }
        };

    }
}