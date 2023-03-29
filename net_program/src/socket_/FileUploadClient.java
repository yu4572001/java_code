package socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws Exception{
        String path = "e:\\1067228.jpg";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        byte[] array = streamToByteArray(bis);
        //连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        //将数组写入进流通道中
        bos.write(array);
        socket.shutdownOutput();

        //关闭相关流
        bis.close();
        socket.close();
        bos.close();
    }

    //静态方法：将输入流转换为一个字节数组并返回
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte bytes[] = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1){
            baos.write(bytes,0,len);
        }
        byte[] array = baos.toByteArray();
        baos.close();
        return array;
    }
}
