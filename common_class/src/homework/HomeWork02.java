package homework;



public class HomeWork02 {
    public static void main(String[] args) {
        String name = "jeck";
        String email = "1291@qq.com";
        String pwd = "138412";
        try {
            check(name,pwd,email);
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static void check(String user, String pwd, String email){
        if (!(user.length() >= 2 && user.length() <= 4)) {
            throw new RuntimeException("用户名长度要在2-4位之间");
        }

        if (!(pwd.length() == 6 && isNum(pwd))){
            throw new RuntimeException("密码长度为6为，且必须为数组组成");
        }

        if (!(isemail(email))){
            throw new RuntimeException("邮箱必须要有'@'和'.'，且'@'要在'.'之前");
        }
    }


    public static boolean isNum(String pwd){
        char num[] = pwd.toCharArray();
        for (int i = 0; i < num.length; i++) {
            if (!(num[i] > '0' || num[i] < '9')){
                return false;
            }
        }
        return true;
    }

    public static boolean isemail(String email){
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (i > 0 && j > i && j < email.length()){
            return true;
        }
        return false;
    }
}
