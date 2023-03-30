import java.sql.*;
import java.util.*;
import java.io.*;
class M28
{
	public static void main(String[] args)
	{
		try{
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
}