package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 雷火丰 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("震上离下");
    }

    @Override
    public void 卦辞() {
        println("亨，王假之。勿忧，宜日中。\n");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初九，遇其配主，虽旬无咎，往有尚。\n" +
                "六二，丰其蔀，日中见斗。往得疑疾，有孚发若，吉。\n" +
                "九三，丰其沛，日中见沫，折其右肱，无咎。\n" +
                "九四，丰其蔀，日中见斗，遇其夷主，吉。\n" +
                "六五，来章有庆誉，吉。\n" +
                "上六，丰其屋，蔀其家，窥其户，阒其无人，三岁不觌，凶。");
    }
}

