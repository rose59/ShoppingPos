import com.google.inject.*;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import tw.AdditionProperty.*;
import tw.parser.Parser;
import tw.parser.StringAndNumberParser;
import tw.parser.StringParser;
import tw.shopping.ShoppingCart;
import tw.shopping.ShoppingCartPrinting;
import tw.shopping.ShoppingItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    @Inject
    @Named("StringAndNumberParser")
    private static Parser StringAndNumberParser;
    @Inject
    @Named("StringParser")
    private static Parser StringParser;
    @Inject
    @Named("AdditionDiscount")
    private static AdditionProperty AdditionDiscount;
    @Inject
    @Named("AdditionSecondHalf")
    private static AdditionProperty AdditionSecondHalf;
    @Inject
    @Named("AdditionFullCut")


    private static AdditionProperty AdditionFullCut;

    public static void main(String[] args) throws IOException {
        //一系列读文件过程
        Injector inj=Guice.createInjector(new Module() {
            @Override
            public void configure(Binder binder) {
                binder.bind(Parser.class).annotatedWith(Names.named("StringAndNumberParser")).to(StringAndNumberParser.class);
                binder.bind(Parser.class).annotatedWith(Names.named("StringParser")).to(StringParser.class);
                binder.bind(AdditionProperty.class).annotatedWith(Names.named("AdditionDiscount")).to(AdditionDiscount.class);
                binder.bind(AdditionProperty.class).annotatedWith(Names.named("AdditionSecondHalf")).to(AdditionSecondHalf.class);
                binder.bind(AdditionProperty.class).annotatedWith(Names.named("AdditionFullCut")).to(AdditionFullCut.class);
                binder.requestStaticInjection(Main.class);
            }
        });
        List listItem = Main.StringAndNumberParser.Parse(".//data//itemlist.txt");
        List listQuantity = Main.StringAndNumberParser.Parse(".//data//Cart.txt");
        List listPromotion = Main.StringAndNumberParser.Parse(".//data//discount_promotion.txt");
        List listSecondHalf = Main.StringParser.Parse(".//data//second_half_price_promotion.txt");
        List listFullCut = Main.StringParser.Parse(".//data//Item_FullCut.txt");
        //一系列录入设置属性过程

        List<ShoppingItem> shoppingItems = new ArrayList<ShoppingItem>();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        AdditionShoppingItem additionShoppingItem = new AdditionShoppingItem(shoppingItems);
        additionShoppingItem.setMap(stringIntegerHashMap, listQuantity);
        additionShoppingItem.setShoppingItems(listItem);
        //计算过程--1.shoppingItem折扣总价
        Main.AdditionDiscount.AdditionProperty(listPromotion, shoppingItems);
        //计算过程--2.shoppingItem二件半价
        Main.AdditionSecondHalf.AdditionProperty(listSecondHalf, shoppingItems);
        //计算过程--3.shoppingItem满减
        Main.AdditionFullCut.AdditionProperty(listFullCut, shoppingItems);

        //形成购物清单
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItems);
        new ShoppingCartPrinting(shoppingCart).printCart(10.0);


    }

}
