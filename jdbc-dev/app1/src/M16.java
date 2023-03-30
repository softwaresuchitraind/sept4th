import java.sql.*;
import java.io.*;
class M16
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String sql="SELECT FIRST_NAME FROM TAB208";
		ResultSet rs=stmt.executeQuery(sql);
		//whatever metadata available in resultset that extracts to resultsetmetadata
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		String c1=rsmd.getColumnName(1);
		//String c2=rsmd.getColumnName(2);
		System.out.println(cols);
		System.out.println(c1);
		//System.out.println(c2);
		
		
	}
}
/*

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M16.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M16
1
FIRST_NAME



*/