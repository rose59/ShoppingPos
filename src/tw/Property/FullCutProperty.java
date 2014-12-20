package tw.Property;

import com.google.inject.Guice;
import tw.calculate.FullCutCalculate;

import java.util.List;

/**
 * Created by 欣 on 2014/12/18.
 */
public class FullCutProperty extends Property {
    private double FullCut;


    public void setFullCut(List<String> list) {
        FullCut = 0.0;
        for (String str : list)
            if (str.equals(this.getShoppingItem().getItem().getName()))
                this.FullCut = 5;
    }

    @Override
    public double getPromotionSum() {
        return Guice.createInjector().getInstance(FullCutCalculate.class).calculate(this.getShoppingItem(), this.FullCut);
    }
}
