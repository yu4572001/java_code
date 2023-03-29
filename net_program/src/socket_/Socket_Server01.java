package socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//TCP字符流
public class Socket_Server01 {
    public static void main(String[] args) throws Exception{
        //通过创建ServerSocket对象在本机监听9999端口号，要求：9999端口没有服务占用
        ServerSocket serverSocket = new ServerSocket(9999);

        //调用accept方法与客户端连接
        //一个ServerSocket对象可以accept多个Socket对象，即多个客户端连接一个端口
        //当没有客户端连接时，程序会被阻塞在这
        System.out.println("服务器在9999端口进行监听，等待连接。。。");
        Socket accept = serverSocket.accept();

        //通过accept.getInputStream方法读取客户端写入到通道的数据
        //接收客户端的数据：先将字节转成字符再输出
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();     //读取一行
        System.out.println(s);

        //给客户端发送数据
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,客户端，字符流");
        bufferedWriter.newLine();    //结束输出
        bufferedWriter.flush();    //刷新


        //关闭流对象及socket
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务器退出。。。");

    }
}
