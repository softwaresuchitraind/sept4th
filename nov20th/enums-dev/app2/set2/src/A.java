class A 
{
	enum Month
	{
		JAN(31), FEB(28), MAR(31);
		int days;
		Month(int days)
		{
			this.days = days;
		}
		public int getDays()
		{
			return days;
		}
	}
	public static void main(String[] args) 
	{
		Month m1 = Month.FEB;
		System.out.println(m1.getDays());
	}
}

/*

-Why do we require arguments to the enum constants.
-Every enum constaint has number of property 
it is varying from one month to another month.
-to manage a common property which is varying form one constraint to another constraints.
-every month varying the value
-enums are only for maintaining enum constants.
-it might have have a common property value getting changed from one constraint to another
then we will be using constructor and non static methods

*/
