package wyx;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException{
		
		int op;	
	
		manage ope=new manage();	//�������������
		   
		do{
			
			System.out.println("*****************************************************************************");
			System.out.println("\n===========================��ӭ��������ʦ����ѧѧ�������ϵͳ===========================");
			System.out.println("\n*****************************************************************************");
			System.out.println("\n 1.��ѯȫ�� ������Ϣ");
			System.out.println(" 2.��ѯ����������Ϣ");
			System.out.println(" 3.��ѯһ��������Ϣ");
			System.out.println(" 4.�˳�");
			//System.out.println("*****************************************************************************");
			System.out.println("\n��ѡ��1-4��");
			
	
			op=input.nextInt(); 
			
			if(op==1)	//��ѯȫ��������Ϣ
				ope.queryall();
			if(op==2)	//��ѯ����������Ϣ
			{
				String date;
				int id;
				System.out.print("������id��");
				id=input.nextInt(); 
				System.out.print("����������:");
				date = input.next(); 
				
				ope.query(id,date);
			}
				
		}while(op!=4);
		   
	}

	

}

