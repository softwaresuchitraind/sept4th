import java.util.*;
import java.sql.*;
class  M39
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
			Scanner sc =new Scanner(System.in);
		System.out.println("Enter Table Name");
		String name=sc.next();
		String sql="SELECT * FROM " + name;
		ResultSet rs=stmt.executeQuery(sql);
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();

		for(int i=1;i<=cols;i++)
			{
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
		System.out.println();
		System.out.println("----------------------");
		while(rs.next())
		{
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