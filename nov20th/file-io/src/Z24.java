import java.io.*;
class Z24 
{
	public static void main(String[] args) 
	{
		
		try(FileInputStream fin = new FileInputStream("test7.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
			Test t1 =(Test)in.readObject();
			System.out.println(t1.i);
			System.out.println(t1.i);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
