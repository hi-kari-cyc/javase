package shujia25.day03;

/*
        选择结构:
            if语句:
                1)语句格式1:
                    if(关系表达式){
                        语句体;
                    }
                当关系表达式结果为true的时候，才会执行语句体。

            switch语句

 */
public class IfDemo1 {
    public static void main(String[] args) {
        String s = "晴天";
        // 如何比较字符串
        // "目标字符串".equals(待比较的字符串值)  如果字符串的内容一样，结果就是true，反之就是false
        if ("晴天".equals(s)){
            System.out.println("出去旅游");
        }
    }
}
