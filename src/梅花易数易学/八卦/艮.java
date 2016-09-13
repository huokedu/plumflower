package 梅花易数易学.八卦;

import 梅花易数易学.自然属性.*;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/9.
 */
public class 艮 extends 卦 implements 卦属性{
    public 艮() {
        天=0;
        人=1;
        地 =1;
    }

    @Override
    public int 先天卦数() {
        return 7;
    }

    @Override
    public String 方位() {
        return direction.东北.toString();
    }

    @Override
    public String 五行() {
        return 五行.土.toString();
    }

    @Override
    public String 旺季() {
        return 十二地支.丑.toString()+十二地支.辰+十二地支.未+十二地支.戌;
    }

    @Override
    public String 衰季() {
        return 四季.春.toString();
    }

    @Override
    public String 万物类属() {
        return 万物类属.艮.getString();
    }

    @Override
    public void 卦象() {
        println("-------");
        println("--- ---");
        println("--- ---");
        println(象例.艮覆碗.toString());
    }
}
