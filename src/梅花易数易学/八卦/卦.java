package 梅花易数易学.八卦;

/**
 * Created by zyf on 2016/9/9.
 */
public abstract class 卦 {
    public int 天,人,地;
    public abstract int 先天卦数();
    public abstract String 方位();
    public abstract String 五行();
    public abstract String 旺季();
    public abstract String 衰季();
    public abstract String 万物类属();

}
