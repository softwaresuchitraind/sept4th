class M37 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja" + "va";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/*
true
true

+ operattor generates a string in the constant pool

+ concatination.
-If any one operand is a reference variable then it uses new Operator.
s1 and s2 pointing to same location

*/