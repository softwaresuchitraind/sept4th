import java.util.Arrays;
class M23 
{
	public static void main(String[] args) 
	{
		int[] x = new int[2];
		x[0] = 100;
		x[1] = 200;
		System.out.println(Arrays.toString(x));
		test(x);
		System.out.println(Arrays.toString(x));
	}
	static void test(int [] x)
	{
		x[0] = 1000;
		x[1] = 2000;
	}
}
