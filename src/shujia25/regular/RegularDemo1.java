package shujia25.regular;


/*
        需求：编写一个java程序检验qq号是否符合规范
        1、必须全部都是数字
        2、必须是5-11
        3、不能以0开头

        通过这个案例，感受一下正则表达式带来的方便之处
 */

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularDemo1 {
    public static void main(String[] args) {
        String qq = "320645998";
        String s = "123a456a214a999a123456";

        String[] split = s.split("a");
        System.out.println(Arrays.toString(split));

        System.out.println(yanZheng1(qq));
        System.out.println(yanZheng2(qq));
    }

    /**
     * 使用传统的if-else方式判断qq号是否符合规范
     */
    public static boolean yanZheng1(String qq){
        //定义一个标志位，一开始的值设置为false，只有条件都能满足的时候才变成true
        boolean flag = false;

        if (qq.length()>=5 && qq.length()<=11){
            if (!qq.startsWith("0")){
                for (int i = 0;i<qq.length();i++){
                    if (!Character.isDigit(qq.charAt(i))){
                        return false;
                    }
                }
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 正则表达式去验证一个字符串是否符合规范，注意，正则表达式本事也是一个字符串
     */

    public static boolean yanZheng2(String qq){
        // matchs表示的是要匹配的字符串 整体 是否符合规则（上面的正则表达式）
        // [1-9]: 表示第一个字符取值的范围只能是1，2，3，4，5，6，7，8，9中任意一个
        // [0-9]: 表示任意一个字符取值的范围只能是0，1，2，3，4，5，6，7，8，9中任意一个
        // {4,10}: 表示左边最近的一组数据的个数可是是4-10个

        /*
        public boolean matches(String regex) {
            return Pattern.matches(regex, this);
        }
         */

        return qq.matches("[1-9][0-9]{4,10}");
    }
}
