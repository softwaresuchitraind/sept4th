import java.util.Scanner;
class G 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age <= 0)
		{
			throw new AgeIsNegativeException("Age should be >0");
		}
		System.out.println("continue......");
	}
}