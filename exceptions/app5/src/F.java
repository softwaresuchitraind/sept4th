import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur age");
		int age=sc.nextInt();
		if(age<=0)
		{
			throw new AgeIsNegativeException();
		}
		System.out.println("Continue");
	}
}
