import java.sql.*;
import java.io.*;
class M12
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		//using alising name
		String sql="SELECT ID P_ID, FIRST_NAME NAME FROM TAB208";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			//we can specify upper/lower case same aliasing name
			System.out.print(rs.getString("p_id") + "\t");
			System.out.println(rs.getString("name"));
		}

		System.out.println("done");
	}
}
/*

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M12.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M12
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