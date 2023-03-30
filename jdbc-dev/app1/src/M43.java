import java.sql.*;
class  M43
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
			String sql1="INSERT INTO TAB208 VALUES(201,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(202,'XYZ')";
			String sql3="INSERT INTO TAB208 VALUES(203,'HELLO')";
			String sql4="INSERT INTO TAB208 VALUES(204,'RAMU')";
			stmt.execute(sql1);
			System.out.print("sql1 triggered");
			stmt.execute(sql2);
			System.out.print("sql2 triggered");
			stmt.execute(sql3);
			System.out.print("sql3 triggered");
			stmt.execute(sql4);
			System.out.print("sql4 triggered");
			
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