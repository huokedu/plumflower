package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 天地否 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("乾上坤下\n");
    }

    @Override
    public void 卦辞() {
        println("否之匪人，不利君子贞，大往小来。");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初六，拔茅茹以其汇。贞吉，亨。\n" +
                "六二，包承，小人吉，大人否。亨。\n" +
                "六三，包羞。\n" +
                "九四，有命，无咎，畴离祉。\n" +
                "九五，休否，大人吉。其亡其亡，系于苞桑。\n" +
                "上九，倾否，先否后喜。 ");
    }
}
