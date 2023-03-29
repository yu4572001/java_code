package socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class Socket_Client {
    public static void main(String[] args) throws Exception{
        //1.连接服务器端，传入要连接的IP地址及端口号，并返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        //2.连接上后，通过socket.getOutputStream方法得到输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流对象将数据输出
        outputStream.write("hello,服务器".getBytes());
        socket.shutdownOutput();   //结束输出

        //4.收到服务器发送的数据，遍历输出
        InputStream inputStream = socket.getInputStream();
        byte bytes[] = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,readLen));
        }

        //5.关闭流对象及socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出。。。");
    }
}
