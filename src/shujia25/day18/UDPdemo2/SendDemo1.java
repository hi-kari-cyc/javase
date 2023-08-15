package shujia25.day18.UDPdemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
    UDP协议发送端代码编写：
        1:建立udp的socket服务
        2:将要发送的数据封装成数据包DatagramPacket
        3:通过udp的socket服务,将数据包发送出
        4:关闭资源

 */
public class SendDemo1 {
    public static void main(String[] args) throws Exception {
        //1:建立udp的socket服务
        DatagramSocket ds = new DatagramSocket();

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //2:将要发送的数据封装成数据包DatagramPacket
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        //buf -- 要发送的数据字节数组形式
        //length -- 字节数组的长度
        //address -- 将目标ip地址封装成InetAddress对象
        //port -- 端口
        while (true){
            System.out.print("请输入要发送的信息：");
            String info = sc.next();


            byte[] bytes = info.getBytes();
            int length = bytes.length;
            InetAddress inetAddress = InetAddress.getByName("192.168.23.62");
            int port = 10086;

            //将数据封装成一个数据包
            DatagramPacket dp = new DatagramPacket(bytes, length, inetAddress, port);


            //3:通过udp的socket服务,将数据包发送出
            //public void send(DatagramPacket p)
            ds.send(dp);

            if("886".equals(info)){
                System.out.println("欢迎下次交流！~");
                break;
            }
        }


        //4:关闭资源
        ds.close();


    }
}
