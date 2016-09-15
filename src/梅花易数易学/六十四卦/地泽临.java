package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 地泽临 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("坤上兑下\n");
    }

    @Override
    public void 卦辞() {
        println("元亨，利贞。至于八月有凶。");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初九，咸临，贞吉。\n" +
                "九二，咸临，吉，无不利。\n" +
                "六三，甘临，无攸利；既忧之，无咎。\n" +
                "六四，至临，无咎。\n" +
                "六五，知临，大君之宜，吉。\n" +
                "上六，敦临，吉，无咎。 ");
    }
}
