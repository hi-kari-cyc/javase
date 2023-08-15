package shujia25.day18.UDPdemo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
    UDP协议发送端代码编写：
        1:建立udp的socket服务
        2:将要发送的数据封装成数据包 DatagramPacket
        3:通过udp的socket服务,将数据包发送出
        4:关闭资源

    DatagramSocket:
        此类表示用于发送和接收数据报数据包的套接字

    DatagramPacket:
        该类表示数据报包。 数据报包用于实现无连接分组传送服务

 */
public class SendDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、建立UDP的socket服务
        DatagramSocket ds = new DatagramSocket();

        // 2、将数据封装成数据包
        // public DatagramPacket(byte buf[],int length,InetAddress address, int port)
        // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        //buf -- 要发送的数据字节数组形式
        //length -- 字节数组的长度
        //address -- 将目标ip地址封装成InetAddress对象
        //port -- 端口
        byte[] bytes = "hello,world".getBytes();

        int length = bytes.length;
        InetAddress address = InetAddress.getByName("192.168.23.62");

        int port = 12345;

        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);

        // 3、通过UDP的socket服务，将数据包发出
        //public void send(DatagramPacket p)
        ds.send(dp);

        // 4、关闭资源
        ds.close();
    }
}
