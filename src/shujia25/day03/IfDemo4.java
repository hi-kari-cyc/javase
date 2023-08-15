package shujia25.day03;

import java.util.Scanner;

/*
    if语句定义3：
        if(关系表达式1){
            语句体1;
        }else if(关系表达式2){
            语句体2;
        }else if(关系表达式3){
            语句体3;
        }
        ......
        }else if(关系表达式n){
            语句体n;
        }else{
            语句体n+1;
        }

        注意：无论分支有多少个，最终只会执行某一个分支

 */
public class IfDemo4 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入班长的性别：");
        String gender = sc.next();

        if("男".equals(gender)){
            System.out.println("去男厕所");
        }else if("女".equals(gender)){
            System.out.println("去女厕所");
        }else {
            System.out.println("您输入的数据有误！！（男/女）");
        }
    }
}
