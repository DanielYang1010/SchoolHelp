package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conn {
	//final �����޸ģ������ʼ��
  public final static String drivername = "com.mysql.jdbc.Driver";
  public final static String user = "root";
  public final static String password = "root";
  public final static String url = "jdbc:mysql://47.107.59.24:888:3306/schoolhelp";
  
  public Connection connection;
  
  //���췽���� ����ͬ����û�з���ֵ��new �����ʱ�����,��ʼ���������úͳ�Ա����
  //ͼ�ν���Ҫ�����ݿⲢ����ɲ�ѯ
  //1.����exe
  //2.��д�������˿ں� �û��� ����� ����
  //3.��д��ѯ��䣨�¿���ѯ�༭����
  //4.ִ�в�ѯ�õ������ѡ�а�f8��
  //5.��ʾ���
  public Conn(){
	  try {
		Class.forName(drivername);//Class.forName��java������ƣ�һ�����ֿ��Ա��һ����Ͷ��󣬶�Ӧ��һ��
		connection = DriverManager.getConnection(url, user, password);//��Ӧ�ĵڶ���
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
 
  
  public static void main(String[] args) {
//	new Conn().getStudent();
}
}