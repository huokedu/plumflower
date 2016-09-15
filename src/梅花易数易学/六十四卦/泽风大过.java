package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 泽风大过 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("兑上巽下");
    }

    @Override
    public void 卦辞() {
        println("栋挠，利有攸往，亨。\n");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，藉用白茅，无咎。\n" +
                "九二，枯杨生稊，老夫得其女妻，无不利。\n" +
                "九三，栋桡，凶。\n" +
                "九四，栋隆，吉。有它，吝。\n" +
                "九五，枯杨生华，老妇得其士夫，无咎无誉。\n" +
                "上六，过涉灭顶，凶。无咎。");
    }
}
