package shujia25.day18;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class test0 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(12345);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true){
            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();
            String info = new String(data, 0, length);

            InetAddress address = dp.getAddress();
            String hostName = address.getHostName();

            System.out.println("用户" + hostName + "发来一条消息：" + info);

            if (info.endsWith("886")){
                break;
            }
        }

        ds.close();

    }
}
