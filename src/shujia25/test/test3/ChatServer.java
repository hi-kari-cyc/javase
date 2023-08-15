package shujia25.test.test3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    // 提供服务
    public void service() {
        try {/**建立服务器连接  0.5分*/
            ServerSocket server = new ServerSocket(10086);
            /**等待客户连接  0.5分*/
            Socket socket = server.accept();
            try {
                /** 读取客户端传过来信息的输入流对象 --0.5分 */
                InputStream is=socket.getInputStream();
                Reader r=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(r);
                /** 向客户端发送信息的输出流对象--0.5分  */
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                // 获取控制台输入的Scanner
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    /** 读取来自服务器的信息  0.5分*/
                    String accpet =br.readLine();
                    System.out.println(accpet);
                    String send = scanner.nextLine();
                    System.out.println("客户端：" + send);
                    /** 把从控制台得到的信息传送给服务器  0.5分*/
                    bw.write(send);

                }
            } finally {// 建立连接失败的话不会执行socket.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ChatServer().service();  /**0.5分*/
    }
}
