package shujia25.day18.TCPdemo1;

/*

    1:建立客户端的Socket服务,并明确要连接的服务器。
    2:如果连接建立成功,就表明,已经建立了数据传输的通道.就可以在该通道通过IO进行数据的读取和写入.该通道称为Socket流,Socket流中既有读取流,也有写入流.
    3:通过Socket对象的方法,可以获取这两个流
    4:通过流的对象可以对数据进行传输
    5:如果传输数据完毕,关闭资源

  注意事项：
    1、客户端的Socket对象如果建立成功，说明和服务器的通道建立成功
    2、如果服务没有启动就启动客户端的话，一定会连接失败，显示连接被拒绝

    Socket:
        构造方法：
            Socket(InetAddress address, int port)   创建流套接字并将其连接到指定IP地址的指定端口号。
            Socket(String host, int port)   创建流套接字并将其连接到指定主机上的指定端口号。

 */


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        //Socket(InetAddress address, int port)
        //创建流套接字并将其连接到指定IP地址的指定端口号。
//        Socket socket = new Socket(InetAddress.getByName("192.168.23.62"), 12345);

        //Socket(String host, int port)
        //创建流套接字并将其连接到指定主机上的指定端口号。
        Socket socket = new Socket("192.168.23.62", 12345);

        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我踏马来啦".getBytes());

        // 获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        System.out.println("服务器反馈：" + new String(bytes, 0, length));

        // 5、关闭资源
        socket.close();
    }
}
