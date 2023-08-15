package shujia25.day18.UDPdemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
UDP协议下的接收端代码编写：
    1:建立udp的socket服务.
    2:通过receive方法接收数据
    3:将收到的数据存储到数据包对象中
    4:通过数据包对象的功能来完成对接收到数据进行解析.
    5:可以对资源进行关闭

 */
public class ReceiveDemo1 {
    public static void main(String[] args) throws Exception {
        //1:建立udp的socket服务.
        //对于接收端，需要绑定本机的一个端口号
        DatagramSocket ds = new DatagramSocket(10086);
        //创建一个新的数据包，用于接收发送过来的数据
        //DatagramPacket(byte[] buf, int length)
        //构造一个 DatagramPacket用于接收长度的数据包 length 。
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true){
            // 2:通过receive方法接收数据
            //public synchronized void receive (DatagramPacket p)
            ds.receive(dp);  //发送阻塞，等待数据过来

            //4:通过数据包对象的功能来完成对接收到数据进行解析.
            byte[] data = dp.getData();  //获取接收到的数据字节数组形式
            int length = dp.getLength(); //获取实际接收到的字节数
            //将接收到的数据封装成字符串
            String info = new String(data, 0, length);

            InetAddress address = dp.getAddress();
            String ip = address.getHostAddress();  //获取发送人的ip地址
            String hostName = address.getHostName(); //获取发送人的主机名
            System.out.println("用户：" + hostName + ",ip地址为：" + ip + ",发来的数据是：" + info);

            if (info.equals("886")){
                break;
            }

        }
        //5:可以对资源进行关闭
        ds.close();
    }
}
