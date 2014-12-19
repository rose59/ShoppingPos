package tw.parser;

/**
 * Created by 欣 on 2014/12/17.
 */
public class Pair {
    private String name;
    private Integer value;

    public Pair(String name,Integer value) {
        this.name = name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }


}
