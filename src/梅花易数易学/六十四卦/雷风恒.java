package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 雷风恒 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("震上巽下\n");
    }

    @Override
    public void 卦辞() {
        println("亨。无咎。利贞。利有攸往。");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，浚恒，贞凶，无攸利。\n" +
                "九二，悔亡。\n" +
                "九三，不恒其德，或承之羞，贞吝。\n" +
                "九四，田无禽。\n" +
                "六五，恒其德，贞，妇人吉，夫子凶。\n" +
                "上六，振恒，凶。");
    }
}
