package shujia25.test.test3;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
    3.模拟qq聊天功能：实现客户端与服务器（一对一）的聊天功能，客户端首先发起聊天，输入的内容在服务器端和客户端显示，
    然后服务器端也可以输入信息，同样信息在客户端和服务端显示。
        提示:
            客户端
        1)客户端编写聊天的方法chat()
        2)要求使用BufferedReader与BufferedWriter缓冲类
        3)编写用于测试的主方法调用chat()方法
            服务器端
        1)编写提供服务的方法service()
        编写用于测试的主方法调用service()方法

 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public void chat() {
        try {
            // 连接到服务器

            Socket socket = new Socket("localhost", 10086);
            try {

                InputStream is=socket.getInputStream();
                Reader r=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(r);

                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                // 装饰标准输入流，用于从控制台输入
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    String send = scanner.nextLine();
                    System.out.println("客户端：" + send);

                    bw.write(send);

                    String accpet =br.readLine();
                    System.out.println(accpet);
                }
            } finally {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ChatClient().chat();
    }
}