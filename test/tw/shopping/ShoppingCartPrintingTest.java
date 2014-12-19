package tw.shopping;

import org.junit.Before;
import org.junit.Test;
import tw.item.Item;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class ShoppingCartPrintingTest {

    private ArrayList<ShoppingItem> shoppingItems;

    @Before
    public void setUp() throws Exception {
        shoppingItems = new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01", 20.0), 2));

    }

    @Test
    public void should_printCart_when_given_shoppingCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItems);
        ShoppingCartPrinting shoppingCartPrinting = new ShoppingCartPrinting(shoppingCart);
        assertTrue(shoppingCartPrinting.printCart(10.0));


    }
}