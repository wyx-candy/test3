package wyx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqldemo {
	
	
	/* public static void main(String[] args) {
         //����Connection����
         Connection con;
         //����������
         String driver = "com.mysql.jdbc.Driver";
         //URLָ��Ҫ���ʵ����ݿ���mydata
         String url = "jdbc:mysql://localhost:3306/wyx";
         //MySQL����ʱ���û���
         String user = "root";
         //MySQL����ʱ������
         String password = "wyx40223";
         //������ѯ�����
         try {
             //������������
             Class.forName(driver);
             //1.getConnection()����������MySQL���ݿ⣡��
             con = DriverManager.getConnection(url,user,password);
           
             //2.����statement���������ִ��SQL��䣡��
             Statement state = con.createStatement();
            
             //3.ResultSet�࣬������Ż�ȡ�Ľ��������
             ResultSet rs =null;  
   
         } catch(ClassNotFoundException e) {   
             //���ݿ��������쳣����
             //System.out.println("Sorry,can`t find the Driver!");   
             e.printStackTrace();   
             } catch(SQLException e) {
             //���ݿ�����ʧ���쳣����
             e.printStackTrace();  
             }catch (Exception e) {
             // TODO: handle exception
             e.printStackTrace();
         }
     }*/
	 


  //URLָ��Ҫ���ʵ����ݿ���
  public static String url = "jdbc:mysql://localhost:3306/wyx"
  		+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
  		
  public static String user = "root";	//mysql����ʱ���û���
  public static String password = "wyx40223";	//mysql����ʱ���û�����
  
  //�������ݿ�
  public static Connection getCon () {
	  //����Connection����
      Connection con = null;
      
      try {
          
      	Class.forName("com.mysql.jdbc.Driver");//��������
      	
          con = DriverManager.getConnection(url, user, password);
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      return con;
  }
  
  //�ر�����
  public static void close (ResultSet rs, Statement state, Connection con) {
      if (rs != null) {
          try {
              rs.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      
      if (state != null) {
          try {
              state.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      
      if (con != null) {
          try {
              con.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
}
