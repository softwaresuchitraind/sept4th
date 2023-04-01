import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age <= 0)
		{
			throw new ArithmeticException("age should be >0");
		}
		System.out.println("continue......");
	}
}
//Dont use existing exception classes for ur abnormal condition
//one exception class multiple abnormal conditions not advisible