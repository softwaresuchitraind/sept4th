import java.sql.*;
class  M47
{
	public static void main(String[] args) 
	{
		

		try(Connection con=Util.getConnection();
			Statement stmt=con.createStatement())
		{
			
			
			
			String sql1="INSERT INTO TAB208 VALUES(601,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(602,'XYZ')";
			
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
run from src
*/