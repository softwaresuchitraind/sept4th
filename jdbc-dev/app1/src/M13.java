import java.sql.*;
import java.io.*;
class M13
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		//we are reading id only
		String sql="SELECT ID FROM TAB208";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			//there is no first_name in resultset even available in table
			System.out.print(rs.getString("id") + "\t");
			System.out.println(rs.getString("first_name"));
		}

		System.out.println("done");
	}
}
/*

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M13.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M13
1       Exception in thread "main" java.sql.SQLException: Invalid column name
        at oracle.jdbc.driver.OracleStatement.getColumnIndex(OracleStatement.java:3661)
        at oracle.jdbc.driver.OracleResultSetImpl.findColumn(OracleResultSetImpl.java:2575)
        at oracle.jdbc.driver.OracleResultSet.getString(OracleResultSet.java:424)
        at M13.main(M13.java:18)
*/