import java.sql.*;
class  M26
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
			if(args.length<2)
			{
				System.out.println("supply 2cla");
				return;
			}
			String s1=args[0];
			String s2=args[1];
			String s3="INSERT INTO TAB209 VALUES(" + s1 +",'" + s2 +"')";
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

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M25.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M25
done
*/