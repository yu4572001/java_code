package socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//TCP字符流
public class Socket_Client01 {
    public static void main(String[] args) throws Exception{
        //1.连接服务器端，传入要连接的IP地址及端口号，并返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        //2.连接上后，通过socket.getOutputStream方法得到输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流对象将数据输出
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello，服务器 字符流");
        bufferedWriter.newLine();     //插入一个换行符，表示输出内容的结束，且接收方必须要用readline()方法读取数据才行
        bufferedWriter.flush();    //一定要记得进行flush刷新，否则数据不会进入通道

        //4.收到服务器发送的数据，遍历输出
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.关闭流对象及socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出。。。");
    }
}
