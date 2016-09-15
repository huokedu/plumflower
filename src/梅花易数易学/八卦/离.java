package 梅花易数易学.八卦;

import 梅花易数易学.自然属性.*;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/9.
 */
public class 离 extends 卦 implements 卦属性{
    public 离() {
        天=0;
        人=1;
        地 =0;
    }

    @Override
    public int 先天卦数() {
        return 3;
    }

    @Override
    public String 方位() {
        return direction.南.toString();
    }

    @Override
    public String 五行() {
        return 五行.火.toString();
    }

    @Override
    public String 旺季() {
        return 四季.夏.toString();
    }

    @Override
    public String 万物类属() {
        return 万物类属.离.getString();
    }

    @Override
    public String 衰季() {
        return 四季.冬.toString();
    }

    @Override
    public void 卦象() {
        println("-------");
        println("--- ---");
        println("-------");
        println(象例.离中虚.toString());
    }

    @Override
    public String toString() {
        return 象例.离中虚.toString();
    }
}
