import java.util.*;
import java.sql.*;
class  M27
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
		//it is declarerd outside to use in the finally
		Connection con=null;
		Statement stmt=null;

		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			Scanner sc= new Scanner(System.in);
			System.out.println("enter id");
			String s1=sc.next();
			System.out.println("enter name");
			String s2=sc.next();
		
			String s3=
			
			"INSERT INTO TAB209 VALUES(" + s1 +",'" + s2 +"')";
			System.out.println(s3);
			stmt.execute(s3);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
/*


G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M27.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M27
enter id
9
enter name
kalu
INSERT INTO TAB209 VALUES(9,'kalu')
done
*/