package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 水泽节 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("坎上兑下\n");
    }

    @Override
    public void 卦辞() {
        println("亨。苦节，不可贞");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初九，不出户庭，无咎。\n" +
                "九二，不出门庭，凶。\n" +
                "六三，不节若，则嗟若，无咎。\n" +
                "六四，安节。亨。\n" +
                "九五，甘节，吉，往有尚。\n" +
                "上六，苦节，贞凶，悔亡");
    }
}

