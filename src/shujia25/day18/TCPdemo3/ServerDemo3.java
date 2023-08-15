package shujia25.day18.TCPdemo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws Exception {
        // 创建服务器ServerSocket对象接收文件
        ServerSocket ss = new ServerSocket(12345);

        Socket socket = ss.accept();


        // 接收文件(获取通道中的输入流)
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day18/TCPdemo3/Server.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务器已经收到文件！".getBytes());

        socket.close();
    }
}
