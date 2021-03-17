import java.sql.Connection;

public class MainClass
{
    public static void main(String args[])
    {
        LoginForm a= new LoginForm();
        UserDAO dao =new UserDAO();
        DBUtil db = new DBUtil();
        db.getConnection();
        dao.findUser("张三", "123456");
        a.init();
        a.display();
        a.validate();
        System.out.println("哈哈哈哈~成功登录界面!");
    }
}
class LoginForm
{
    public void init()
    {
        System.out.println("初始化成功!");
    }
    public void display()
    {
        System.out.println("显示窗口成功!");
    }
    public void validate()
    {
        System.out.println("登录成功!");
    }
}
class UserDAO
{
    public boolean findUser(String userName,String userPassword)
    {
        System.out.println("张三登陆成功!");
        return false;
    }
}
class DBUtil
{
    public Connection getConnection()
    {
        Connection con =null ;
        System.out.println("数据库连接成功!");
        return con;
    }
}

