package shujia25.day16;

/*
    登录注册IO版

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) throws Exception {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);


        System.out.println("===================================");
        System.out.println("===========欢迎来到登录网址!===========");
        System.out.println("====================================");

        System.out.println("请先登录！");
        System.out.print("请输入您的账户：");
        String username = sc.next();
        System.out.print("请输入您的密码：");
        String password = sc.next();

        /*
            加载配置文件，获取用户的信息
         */
        //创建配置文件对象
        Properties prop = new Properties();
        //调用方法加载自己的配置文件
        //创建一个字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src/shujia25/day16/File/userinfo.properties"));
        prop.load(br);
        //根据key获取配置文件中的value值
        String userList = prop.getProperty("userList");
        String passList = prop.getProperty("passList");

        //切分获取的用户列表字符串，判断即将登录的用户是否存在
        String[] userArray = userList.split(",");
        String[] pdArray = passList.split(",");

        boolean flag = true;
        for (int i = 0; i < userArray.length; i++) {
            if (username.equals(userArray[i]) && password.equals(pdArray[i])){
                System.out.println("登陆成功！");
                flag = false;
            }
        }

        if (flag){
            System.out.println("该用户不存在，请先注册！");
            System.out.print("请输入新用户的名称：");
            String name1 = sc.next();
            System.out.print("请输入新用户的密码：");
            String pd1 = sc.next();
            System.out.println("正在保存.....请稍后....");
            Thread.sleep(1000); //后面的多线程的时候会讲解，让程序停5秒钟
            userList = userList + "," + name1;
            passList = passList+","+pd1;
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day16/File/userinfo.properties"));
            bw.write("userList="+userList);
            bw.newLine();
            bw.write("pdList="+passList);
            bw.flush();
            System.out.println("新用户创建成功！！！");

        }

    }
}
