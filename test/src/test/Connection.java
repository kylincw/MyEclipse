package test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.��������
		//��com.mysql.jdbc.Driver����ֽ�����ص�JVM
		//��һ���ֽ��뱻���ص�JVMʱ���ͻ�ִ�и��ֽ���ľ�̬�����
		Class.forName("com.mysql.jdbc.Driver"); 				//1.6֮�����ȡ����javaWeb����Ҫ��
		//2.��ȡ���Ӷ���
		String url = "jdbc:mysql://localhost:3306/my_test";  	//���ݿ��ַ
		String user = "root";									//�û���
		String password = "kylin";							//����
		java.sql.Connection conn =  DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
