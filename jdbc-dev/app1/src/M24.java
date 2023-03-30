import java.sql.*;
class  M24
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
			//composing sql command
			String s1="INSERT INTO TAB209 VALUES(2,'Kiran')";
			String s2="INSERT INTO TAB209 VALUES(3,'babu')";
			String s3="INSERT INTO TAB209 VALUES(4,'murali')";
			String s4="INSERT INTO TAB209 VALUES(5,'chethan')";
			stmt.execute(s1);
			stmt.execute(s2);
			stmt.execute(s3);
			stmt.execute(s4);
			
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


G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M24.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M24
done
*/