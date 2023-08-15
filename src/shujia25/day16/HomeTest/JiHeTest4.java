package shujia25.day16.HomeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
     假如有以下email数据“aa@sohu.com,bb@ 163.com,cc@sina.com,..”
     现需要把email 中的用户部分和邮件地址部分分离，分离后以键值对应的方式放入HashMap？

 */
public class JiHeTest4 {
    public static void main(String[] args) {
        String s = "aa@sohu.com,bb@ 163.com,cc@sina.com";
        String[] arr = s.split(",");

        HashMap<String, String> map = new HashMap<>();
        for (String s1 : arr) {
            String substring1 = s1.substring(0, 2);
            String substring2 = s1.substring(2);
            map.put(substring1, substring2);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("用户名：" + key + "     邮件地址：" + value);
        }
    }
}
