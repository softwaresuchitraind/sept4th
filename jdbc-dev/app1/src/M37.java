import java.util.*;
import java.sql.*;
class  M37
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
			String sql="SELECT * FROM TAB209";
			ResultSet rs=stmt.executeQuery(sql);
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			while(rs.next())
			{
			//for every row for name is executing
				for(int i=1;i<=cols;i++)
					{
						System.out.print(rs.getString(i) + "\t");
					}
		
					System.out.println();	
				}
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



*/