package tw.Property;

import tw.parser.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 欣 on 2014/12/18.
 */
public class QuantityProperty {

    private Map<String, Integer> map = new HashMap<String, Integer>();

    public void setQuantityProperty(List<Pair> pairs) {
        for (Pair pair : pairs) {
            if (map.containsKey(pair.getName())) {
                int number = map.get(pair.getName()) + pair.getValue();
                map.replace(pair.getName(), number);
            } else
                map.put(pair.getName(), pair.getValue());
        }
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }
}
