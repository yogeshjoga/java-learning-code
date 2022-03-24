
import java.sql.*;

public class jdbc
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","salmas");
System.out.println("Driver Connected");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emp");
while(rs.next())
{
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}
st.close();
con.close();
}

catch(Exception e)
{
System.out.println(e);
}

finally
{
System.out.println("it's finally block executed");
}

}
}