/*
	Find out length of the string without length method
*/
class M311 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		//convering into character array using length property
		System.out.println(s1.toCharArray().length);
		//Adding a new character finding last index is length
		System.out.println((s1 + "r").lastIndexOf('r'));
		System.out.println(s1+"r");
	}
}
