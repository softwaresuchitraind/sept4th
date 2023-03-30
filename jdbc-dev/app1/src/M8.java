import java.sql.*;
import java.io.*;
class M8
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String sql="SELECT * FROM TAB208";
		//to read the record result set has record pointer or cursor,this cursor/pointer will before 1st loop
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())//cursor checking 1st record---and onwords
		{
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}

		System.out.println("done");
	}
}
/*
As soon as we are getting resultser cursor is at top of the result set while calling next() cursor checking 1st re
record if true, read 1st column and second column.

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M8
1       RAMU
1       RAMU
2       Kiran
3       KUMAR
4       murali
9       8
6       manu
7       manu
9       ss
9       sss
12      suchitra
13      suchitra1
100     manu
101     ramana
102     mohan
103     kumar
done
*/