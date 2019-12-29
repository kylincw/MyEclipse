package test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.加载驱动
		//把com.mysql.jdbc.Driver这份字节码加载到JVM
		//当一份字节码被加载到JVM时，就会执行该字节码的静态代码块
		Class.forName("com.mysql.jdbc.Driver"); 				//1.6之后可以取消，javaWeb必须要加
		//2.获取连接对象
		String url = "jdbc:mysql://localhost:3306/my_test";  	//数据库地址
		String user = "root";									//用户名
		String password = "kylin";							//密码
		java.sql.Connection conn =  DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
