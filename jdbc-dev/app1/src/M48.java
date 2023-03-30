import java.sql.*;
class  M48
{
	public static void main(String[] args) 
	{
		

		try(Connection con=Util.getConnection();
			Statement stmt=con.createStatement())
		{
			
			
			
			String sql1="INSERT INTO TAB208 VALUES(701,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(702,'XYZ')";
			
			int i=stmt.executeUpdate(sql1);
			i+=stmt.executeUpdate(sql2);
			System.out.println("done :"+ i);
		
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
			
		}
		
		
	}
}

/*


*/