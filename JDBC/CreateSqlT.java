import  java.sql.*;
public class  CreateSqlT
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##yogi","yogi");
			Statement stmt=con.createStatement();
			boolean b=stmt.execute("create table student(rollno number(3),name varchar2(10),marks number(3))");
			System.out.println("Tabel created");

		}
		catch(Exception e)
		{
		System.err.println(e);
		}
	}
}




/*import java.sql.*;  
class FetchRecord{  
public static void main(String args[])throws Exception{ 
 
Class.forName("oracle.jdbc.driver.OracleDriver");  

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  

Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  

//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  

int result=stmt.executeUpdate("delete from emp765 where id=33");  

System.out.println(result+" records affected");
  
con.close();  
}}  */