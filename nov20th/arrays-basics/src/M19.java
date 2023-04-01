class M19 
{
	public static void main(String[] args) 
	{
		int[]x = new int[5]; 
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i]+", ");
		}
		System.out.println();
		//enhanced for loop--reading content of array or collection--for-each
		//JDK 1.5

		//i is the element of the array
		for(int i : x)
		{
			System.out.print(i + ", ");
		}
		System.out.println();
		// to read every element
		System.out.println(java.util.Arrays.toString(x));
	}
}

/*
-To read the elements of array use one of the three approaches
*/