package socket_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    public static void main(String[] args) throws Exception{
        //监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);

        //等待连接
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        String path = "e:\\8489191.jpg";
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        byte[] array = FileUploadClient.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(array);
        bos.close();

        bis.close();
        accept.close();
        serverSocket.close();
    }
}
