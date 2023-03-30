import java.sql.*;
class M5
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		if(args.length<2)
		{
			System.out.println("supply 2cla");
			return;
		}
		String s1=args[0];
		String s2=args[1];
		String s3="INSERT INTO TAB208 VALUES(" + s1 +",'" + s2 +"')";
		System.out.println(s3);
		stmt.execute(s3);
		System.out.println("done");
	}
}