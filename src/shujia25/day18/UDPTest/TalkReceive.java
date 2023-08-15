package shujia25.day18.UDPTest;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TalkReceive implements Runnable {
    private DatagramSocket server;
    private String from;

    public TalkReceive(int port, String from) {
        this.from = from;
        try {
            server = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length);
            try {
                server.receive(dp);
                byte[] data = dp.getData();
                int length = dp.getLength();
                String info = new String(data, 0, length);
                InetAddress address = dp.getAddress();
                String hostName = address.getHostName();
                System.out.println(from + hostName + "发来消息：" + info);
                if (info.equals("bye")){
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        server.close();
    }
}
