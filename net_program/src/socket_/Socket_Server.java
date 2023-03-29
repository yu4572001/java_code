package socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

//服务器端
public class Socket_Server {
    public static void main(String[] args) throws Exception{
        //通过创建ServerSocket对象在本机监听9999端口号，要求：9999端口没有服务占用
        ServerSocket serverSocket = new ServerSocket(9999);

        //调用accept方法与客户端连接
        //一个ServerSocket对象可以accept多个Socket对象，即多个客户端连接一个端口
        //当没有客户端连接时，程序会被阻塞在这
        System.out.println("服务器在9999端口进行监听，等待连接。。。");
        Socket accept = serverSocket.accept();

        //通过accept.getInputStream方法读取客户端写入到通道的数据
        InputStream inputStream = accept.getInputStream();

        //遍历输出：
        byte bytes[] = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,readLen));
        }

        //给客户端发生数据
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,客户端".getBytes());
        accept.shutdownOutput();    //结束输出

        //关闭流对象及socket
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务器退出。。。");

    }
}
