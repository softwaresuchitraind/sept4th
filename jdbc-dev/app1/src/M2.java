import java.sql.*;
class M2 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String s1="INSERT INTO TAB210 VALUES(1,'RAMU')";
		stmt.execute(s1);
		stmt.close();
		con.close();
		System.out.println("done");
	}
}

/*
G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M2.java

G:\sept4th\jdbc-dev\app1\src>cd..

G:\sept4th\jdbc-dev\app1>cd classes

G:\sept4th\jdbc-dev\app1\classes>java M2
done
*/
