package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 水地比 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("坎上坤下");
    }

    @Override
    public void 卦辞() {
        println("吉。原筮，元，永贞，无咎。不宁方来，后夫凶。\n");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，有孚比之，无咎。有孚盈缶，终来有它，吉。\n" +
                "六二，比之自内，贞吉。\n" +
                "六三，比之匪人。\n" +
                "六四，外比之，贞吉。\n" +
                "九五，显比，王用三驱，失前禽，邑人不诫，吉。\n" +
                "上六，比之无首，凶。");
    }
}
