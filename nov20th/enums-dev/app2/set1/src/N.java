class N 
{
	public static void main(String[] args) 
	{
		Month all[] = Month.values();

		for(int i =0; i< all.length; i++)
		{
			System.out.println(all[i]);
		}
	}
}

/*
There are several bulit in functions in enum
-There is a class with name as enum.Every enum is internally derived enum class
-we can not use extends or implements Enum
-Values() is a static method from the inherited enum.

-value() method of enum returning all the constants into array().

*/
