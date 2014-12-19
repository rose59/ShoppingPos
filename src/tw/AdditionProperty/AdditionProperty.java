package tw.AdditionProperty;

import tw.shopping.ShoppingItem;

import java.util.List;

/**
 * Created by 欣 on 2014/12/18.
 */
public abstract class AdditionProperty <T>{
    public void AdditionProperty (List<T> listPromotion, List<ShoppingItem> shoppingItems) {
        for (ShoppingItem shoppingItem:shoppingItems){
            AddProperty(listPromotion, shoppingItem);
        }
    }
    public abstract void AddProperty(List<T> list, ShoppingItem shoppingItem);



}
