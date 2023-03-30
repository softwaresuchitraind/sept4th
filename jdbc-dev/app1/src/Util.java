import java.sql.*;
import java.util.*;
import java.io.*;
class Util 
{
	private static final String driverClass;
	private static final String url;
	private static final String username;
	private static final String password;

	static
	{
		Properties pr=new Properties();
		try(FileReader fin=new FileReader("db.properties"))
		{
			pr.load(fin);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		driverClass=pr.getProperty("driverClass");
		url=pr.getProperty("url");
		username=pr.getProperty("username");
		password=pr.getProperty("password");
	}//sib end

	static
	{
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	public static Connection getConnection()
		throws SQLException

	{
		Connection con=
		DriverManager.getConnection(url,username,password);
		return con;
	}
}
