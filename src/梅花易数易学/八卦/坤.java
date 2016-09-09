package 梅花易数易学.八卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/9.
 */
public class 坤 extends 卦 implements 卦属性{
    public 坤() {
        天=1;
        人=1;
        地 =1;
    }

    @Override
    public int 先天卦数() {
        return 8;
    }

    @Override
    public String 方位() {
        return null;
    }

    @Override
    public String 五行() {
        return null;
    }

    @Override
    public String 旺季() {
        return null;
    }

    @Override
    public String 万物类属() {
        return null;
    }

    @Override
    public void 卦象() {
        println("--- ---");
        println("--- ---");
        println("--- ---");
    }
}
