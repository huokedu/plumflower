package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 离为火 extends 六十四卦 {
    @Override
    public void 卦意() {
        println("离上离下");
    }

    @Override
    public void 卦辞() {
        println("利贞。亨。畜牝牛吉。");
    }

    @Override
    public void 卦爻() {
        println();
    }

    @Override
    public void 六爻() {
        println("初九，履错然，敬之无咎。\n" +
                "六二，黄离，元吉。\n" +
                "九三，日昃之离，不鼓缶而歌，则大耋之嗟，凶。\n" +
                "九四，突如，其来如，焚如，死如，弃如。\n" +
                "六五，出涕沱若，戚嗟若，吉。\n" +
                "上九，王用出征，有嘉折首，获匪其丑，无咎。");
    }
}
