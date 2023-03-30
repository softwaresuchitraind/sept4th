//Auto resource closing
import java.sql.*;
class  M46
{
	public static void main(String[] args) 
	{
		//Declaration of variable
		String driverClass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="Prafulla#68";
		//Driver registration
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}


			/*By using semicolon as separator any number of closable type can be opened.
			--result set also closable
			*/

		try(Connection con=
			DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement())
		{
			
			
			
			String sql1="INSERT INTO TAB208 VALUES(501,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(502,'XYZ')";
			
			stmt.execute(sql1);
			stmt.execute(sql2);
			System.out.println("done");
		
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
			
		}
		
		
	}
}

/*
autometically closing done by try block itself after jdk 1.7 onwords
no need for finally
whatever closable statement opened by try block that is closing autometically.
*/