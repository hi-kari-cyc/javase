package shujia25.regular;

/*
        反向引用
 */
/*
    正则表达式中的反向引用是一种特性，它允许你在同一个正则表达式模式中引用先前已经捕获的子字符串。这通常用于查找和替换操作。

在正则表达式中，你可以使用括号 ( ) 来创建捕获组。当你在模式中创建了捕获组，这些捕获组会将匹配到的子字符串保存起来，以供后续使用。反向引用允许你在同一个正则表达式中引用之前已经捕获的内容。

反向引用的基本语法是使用反斜杠 \，后面跟上一个数字，表示引用捕获组的顺序号。例如：

\1 引用第一个捕获组的内容。
\2 引用第二个捕获组的内容。
以此类推。
在字符串处理函数（例如 replaceAll）中，你可以使用反向引用来实现复杂的替换操作。例如，将重复出现的内容替换为单个内容，或者根据捕获的内容进行某些更改。

在我们之前讨论的例子中，(.) 创建了一个捕获组，捕获了单个字符。然后，在替换部分，我们使用了 $1，它引用了第一个捕获组中的内容，从而在叠词中只保留了一个字符。这就是反向引用的应用之一。

 */
public class RegularDemo9 {
    public static void main(String[] args) {
        //日期案例
        // 2022-03-28  ---> 03/28/2022  $2/$3/$1
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
        String str = "2022-03-28 dasdas 2022-04-05";
        System.out.println(str.replaceAll(regex,"$2/$3/$1"));
        System.out.println(str.replaceAll(regex,"$2/$1"));

        //需求2：我不想你取出月份
        regex = "(\\d{4})-(?:\\d{2})-(\\d{2})";     // ?:  匹配但不获取结果
        System.out.println(str.replaceAll(regex,"$2/$1"));

    }
}
