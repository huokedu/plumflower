package 梅花易数易学.六十四卦;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/14.
 */
public class 乾为天 extends 六十四卦{

    @Override
    public void 卦意() {
        println("乾上乾下，乾为健、为天");
    }

    @Override
    public void 卦辞() {
        println("元，亨，利，贞。\n洋溢着无穷生命力的你排除万难，到达目的地，自然大吉大利。");
    }

    @Override
    public void 卦爻() {
        println("阳刚强健，奋发向上");
    }

    @Override
    public void 六爻() {
        println("初九 潜龙勿用    养精蓄锐，等待时机" +
                "\n九二   见龙在田    已具才能，初露头角" +
                "\n九三   终日乾乾    努力不懈，警惕谨慎" +
                "\n九四   或跃在渊    审时度势，待机奋进" +
                "\n九五   飞龙在天    盈满则溢，及时隐退" +
                "\n上九   亢龙有悔    天时地利，大展宏图" +
                "\n用九   群龙无首    平等相处，同舟共济");
    }
}
