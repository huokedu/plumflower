package 梅花易数易学;

import 梅花易数易学.八卦.卦;
import 梅花易数易学.六十四卦.六十四卦;

import java.util.Date;

import static Print.Print.println;

/**
 * Created by zyf on 2016/9/15.
 */
public class 测算类 {
    public static 卦  findit(String 类)throws Exception{
        Class qian = Class.forName(类);
        卦 rme=(卦) qian.newInstance();
//        println(rme.万物类属());
        return rme;
    }
    public static 六十四卦 findthat(String 类)throws Exception{
        Class qian = Class.forName(类);
        六十四卦 rme=(六十四卦) qian.newInstance();
//        println(rme.万物类属());
        return rme;
    }
    public static void calculate()throws Exception{
        String 卦="梅花易数易学.八卦.";
        String[] 八卦 = {"乾","兑","离","震","巽","坎","艮","坤"};
        String 六十四 ="梅花易数易学.六十四卦.";
        String[][] 六十四卦={{"乾为天","天泽履","天火同人","天雷无妄","天风姤","天水讼","天山豚","天地否"},
                {"泽天夬","兑为泽","泽火革","泽雷随","泽风大过","泽水困","泽山咸","泽地萃"},
                {"火天大有","火泽睽","离为火","火雷噬嗑","火风鼎","火水未济","火山旅","火地晋"},
                {"震为雷","雷天大壮","雷泽归妹","雷火丰","震为雷","雷风恒","雷水解","雷山小过","雷地豫"},
                {"风天小畜","风泽中孚","风火家人","风雷益","巽为风","风水涣","风山渐","风地观"},
                {"水天需","水泽节","水火既济","水雷屯","水风井","坎为水","水山蹇","水地比"},
                {"山天大蓄","山泽损","山火贲","山雷姬","山风蛊","山水蒙","艮为山","山地剥"},
                {"地天泰","地泽临","地火明夷","地雷复","地风升","地水师","地山谦","坤为地"}
        };
        Date date = new Date();
        int year = (date.getYear()+1)%12;
        int month = date.getMonth();
        int day = date.getDay();
        int hour = (date.getHours()+3)/2;
        if (hour>12)
            hour=hour-12;
//        println(year+" "+month+" "+day+" "+hour);
        println("年为："+year);
        println("月为："+month);
        println("日为："+day);
        println("时为："+hour);
        int shang = (year+month+day)%8;
        int xia = (year+month+day+hour)%8;
        int yao = (year+month+day+hour)%6;
        卦 上卦= findit(卦+八卦[shang]);
        卦 下卦 = findit(卦+八卦[xia]);
        println("上卦为："+上卦.getClass().getSimpleName()+"      属性为:"+上卦.五行()+"     象例为:"+上卦.toString());
        println("下卦为："+下卦.getClass().getSimpleName()+"      属性为:"+下卦.五行()+"     象例为:"+下卦.toString());
        int 上 = 上卦.人+上卦.地*2+下卦.天*4;
        int 下 = 上卦.地+下卦.天*2+下卦.人*4;
        上卦= findit(卦+八卦[上]);
        下卦 = findit(卦+八卦[下]);
        println("互卦上卦为:"+上卦.getClass().getSimpleName()+"      属性为:"+上卦.五行());
        println("互卦下卦为:"+下卦.getClass().getSimpleName()+"      属性为:"+下卦.五行());
        println("动爻为："+(yao+1));
        if (yao>2)
            println("体卦为下卦");
        else
            println("体卦为上卦");
        findthat(六十四+六十四卦[shang][xia]).六爻();

    }
    public static void main(String[] args)throws ClassNotFoundException,Exception{
//        println(direction.东.toString());
//        println(万物类属.巽.getString());

        calculate();
    }
}
