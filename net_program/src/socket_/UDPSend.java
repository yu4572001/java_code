package socket_;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend { 
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] bytes = "hello，明天吃火锅".getBytes();
        //打包并指定数据与发送地址
        DatagramPacket pa = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 9999);

        //发送
        socket.send(pa);

        //接收
        byte[] bytes1 = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes1, bytes1.length);
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
    }
}
