package shujia25.day18;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/*
    InetAddress: 此类表示Internet协议（IP）地址。
        因为这个类没有构造方法，但是通过观察发现，我们可以使用静态的成员方法获取该类的对象
    static InetAddress getByName(String host)  确定主机名称的IP地址。

    InetSocketAddress:包含IP和端口信息，常用于Socket通信，不依赖任何协议
 */

public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        // static InetAddress getByName(String host)
        // 通过该方法获得该类的对象
        // 确定主机名称的IP地址。
        InetAddress inetAddress = InetAddress.getByName("192.168.23.62");

        //获取主机名
        System.out.println(inetAddress.getHostName());

        //获取ip地址
        System.out.println(inetAddress.getHostAddress());


        InetSocketAddress inetSocketAddress = new InetSocketAddress("192.168.23.62", 8080);
        // 获得端口号
        System.out.println(inetSocketAddress.getPort());
        //获取主机名
        System.out.println(inetSocketAddress.getHostName());
    }
}
