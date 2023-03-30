import java.sql.*;
import java.io.*;
class M35
{
	public static void main(String[] args)
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String sql="SELECT * FROM TAB209";
		ResultSet rs=stmt.executeQuery(sql);
		//whatever metadata available in resultset that extracts to resultsetmetadata
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		String c1=rsmd.getColumnName(1);
		String c2=rsmd.getColumnName(2);
		System.out.println(cols);
		System.out.println(c1);
		System.out.println(c2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
/*


*/