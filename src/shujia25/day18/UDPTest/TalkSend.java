package shujia25.day18.UDPTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class TalkSend implements Runnable{
    private DatagramSocket socket;
    private BufferedReader reader;
    private String toIP; // 对方的IP
    private int toPort;  // 对方的端口号

    public TalkSend(int port,String toIP,int toPort){
        this.toPort = toPort;
        this.toIP = toIP;

        try {
            socket = new DatagramSocket(port);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch (SocketException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while (true){
            String data;
            try {
                data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, new InetSocketAddress(this.toIP, this.toPort));
                socket.send(dp);
                if (data.equals("bye")) {
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
