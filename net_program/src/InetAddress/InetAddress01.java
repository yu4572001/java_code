package InetAddress;

import java.net.InetAddress;

public class InetAddress01 {
    public static void main(String[] args) throws Exception{

        //InetAddress中又很多静态方法，可以直接用
        //得到本机的InetAddress对象(主机名及IP地址)
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);    //DESKTOP-22COOA1/192.168.124.9

        //根据主机名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("DESKTOP-22COOA1");
        System.out.println(byName);     //DESKTOP-22COOA1/192.168.124.9

        //根据指定域名返回InetAddress对象
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);      //www.baidu.com/39.156.66.14

        //通过InetAddress对象，获取相应的IP地址
        String str = localHost.getHostAddress();
        System.out.println(str);      //192.168.124.9


    }
}
