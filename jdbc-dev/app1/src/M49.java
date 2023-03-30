import java.sql.*;
class  M49
{
	public static void main(String[] args) 
	{
		

		try(Connection con=Util.getConnection();
			Statement stmt=con.createStatement())
		{
			
			
			
			String sql1="INSERT INTO TAB208 VALUES(701,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(702,'XYZ')";
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			int[] results=stmt.executeBatch();
			System.out.println("done :"+ java.util.Arrays.toString(results));
		
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
			
		}
		
		
	}
}

/*
if u want to send batch of multiple statement in the batch statement
done :[1, 1]
*/