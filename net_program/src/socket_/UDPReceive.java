package socket_;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//演示UDP网络通信
public class UDPReceive {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9999);

        byte[] bytes = new byte[1024];
        //创建装数据的包
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //用创建的这个包来接收数据，相当于一个篮子
        socket.receive(packet);

        //拆包
        int length = packet.getLength();    //实际接收到的数据字节长度
        byte[] data = packet.getData();    //得到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        byte[] bytes1 = "好的，明天见".getBytes();
        DatagramPacket packet1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("127.0.0.1"), 9998);
        socket.send(packet1);

        socket.close();
    }
}
