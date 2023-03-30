import java.sql.*;
import java.io.*;
class M7
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		FileReader fin=new FileReader("date.txt");
		BufferedReader bin=new BufferedReader(fin);
		String line=null;
		String id,name,sql;
		while((line=bin.readLine())!=null)
		{
			id=line.substring(0,line.indexOf(';'));
			name=line.substring(line.indexOf(';')+1,line.length());
			sql=
			"INSERT INTO TAB209 VALUES(" + id + ", '"+ name +"')";
			stmt.execute(sql);
		}
		
		System.out.println("done");
	}
}
/*
*keep date.txt inside classes folder.

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M7.java

G:\sept4th\jdbc-dev\app1\src>cd ../classes

G:\sept4th\jdbc-dev\app1\classes>java M7
done


*/