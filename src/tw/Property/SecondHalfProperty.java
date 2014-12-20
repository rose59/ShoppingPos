package tw.Property;

import com.google.inject.Guice;
import tw.calculate.SecondHalfCalculate;

import java.util.List;

/**
 * Created by 欣 on 2014/12/18.
 */
public class SecondHalfProperty extends Property {
    double secondHalf;

    public void setSecondHalf(List<String> list) {
        this.secondHalf = 1.0;
        for (String str : list) if (str.equals(this.getShoppingItem().getItem().getName())) this.secondHalf = 0.5;
    }

    @Override
    public double getPromotionSum() {
        return Guice.createInjector().getInstance(SecondHalfCalculate.class).calculate(this.getShoppingItem(), this.secondHalf);
    }
}
