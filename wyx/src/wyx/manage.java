package wyx;
import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class manage {
   //��ѯȫ��������Ϣ
  public void queryall() {
  	System.out.println("\nѧ��" + "\t\t" + "����" + "\t\t" + "ѧԺ" + "\t\t" + "�Ƿ�ȷ��"+"\t\t"+"����" );  
      System.out.println("**************************************************************************************"); 
      String sql = "select * from test";
      Connection con =mysqldemo.getCon();
      Statement state = null;
      ResultSet rs = null;

      try {
          state = con.createStatement();
          rs = state.executeQuery(sql);
        
          while (rs.next()) {
              int id = rs.getInt("id");
              String name = rs.getString("name");
            
              String academy = rs.getString("academy");
              String ill = rs.getString("ill");
              Date date=rs.getDate("date");
              
              System.out.println(id + "\t" + name +  "\t\t" + academy + "\t\t" + ill+ "\t\t"  + date );
              System.out.println();
          }
      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          mysqldemo.close(rs, state, con);
      }
  }
  
  //��ѯ����������Ϣ
  public void query(int id,String date) {
      System.out.println("\nѧ��\t\t����\t\tѧԺ\t\t�Ƿ�ȷ��\t\t����");
      String sql = "select * from test where id ='" + id + "' and DATE_FORMAT(date,'%Y%m%d') = "+date;
      Connection con = mysqldemo.getCon();
      Statement state = null;
      ResultSet rs = null;
      
      try {
          state = con.createStatement();
          rs = state.executeQuery(sql);
          while (rs.next()) {
              String name = rs.getString("name");
              String academy = rs.getString("academy");
              String ill = rs.getString("ill");
              
              System.out.println(id + "\t" + name +  "\t\t" + academy + "\t\t" + ill + "\t\t"  + date);
              System.out.println();
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
      	mysqldemo.close(rs, state, con);
      }
  }
}


