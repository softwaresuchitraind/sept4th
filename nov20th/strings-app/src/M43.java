class M43 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		// String s2 = "ja" + "va";
		String s2 = "ja".concat("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/*
false
true
-Inside body of the concat method it is using this+arg-----this is a current object that is 
why it is generated in non constant pool

*/
