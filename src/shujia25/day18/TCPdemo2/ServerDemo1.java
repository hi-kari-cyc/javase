package shujia25.day18.TCPdemo2;

/*
    服务器端代码：
        1:建立服务器端的socket服务，需要一个端口
        2:服务端没有直接流的操作,而是通过accept方法获取客户端对象，在通过获取到的客户端对象的流和客户端进行通信
        3:通过客户端的获取流对象的方法,读取数据或者写入数据
        4:如果服务完成,需要关闭客户端,然后关闭服务器，但是,一般会关闭客户端,不会关闭服务器,因为服务端是一直提供服务的

 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建socket对象并绑定一个端口号
        ServerSocket ss = new ServerSocket(12345);

        Socket socket = ss.accept();    // 监听客户端的连接 这里我们只监听了一次，所以此案例只允许一个客户端连接

        InetAddress inetAddress = socket.getInetAddress();
        String hostName = inetAddress.getHostName();



        while (true){
            // 获取通道中的输入流
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int length = inputStream.read(bytes);
            String info = new String(bytes, 0, length);
            System.out.println("客户端" + hostName + "发来消息：" + info);

            // 获取通道中的输出流
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("服务器已收到：".getBytes());
        }


        // 4:如果服务完成,需要关闭客户端,然后关闭服务器，但是,一般会关闭客户端,不会关闭服务器,因为服务端是一直提供服务的
//        ss.close();
    }
}
