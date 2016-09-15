package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 山风蛊 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("艮上巽下");
    }

    @Override
    public void 卦辞() {
        println("元亨。利涉大川，先甲三日，后甲三日。\n");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，干父之蛊，有子，考无咎。厉，终吉。\n" +
                "九二，干母之蛊，不可贞。\n" +
                "九三：干父小有晦，无大咎。\n" +
                "六四，裕父之蛊，往见吝。\n" +
                "六五，干父之蛊，用誉。\n" +
                "上九，不事王侯，高尚其事。 ");
    }
}
