package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 风地观 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("巽上坤下\n");
    }

    @Override
    public void 卦辞() {
        println("盥而不荐。有孚顒若。\n");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，童观，小人无咎，君子吝。\n" +
                "六二，窥观，利女贞。\n" +
                "六三，观我生，进退。\n" +
                "六四，观国之光，利用宾于王。\n" +
                "九五，观我生，君子无咎。\n" +
                "上九，观其生，君子无咎。");
    }
}
