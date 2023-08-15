package shujia25.day18.TCPdemo3;

import java.io.*;
import java.net.Socket;


public class ClientDemo3 {
    public static void main(String[] args) throws Exception {
        // 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket socket = new Socket("192.168.23.62", 12345);

        // 封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("src/shujia25/day18/TCPdemo3/Client.txt"));
        // 发送文本
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        socket.shutdownOutput();

        // 接收反馈
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = is.read(bytes)) != -1) {
            String info = new String(bytes, 0, length);
            System.out.println("服务器给出反馈：" + info);
        }

        bw.close();
        br.close();

    }
}
