//23. Write a java program to find all permutations of a string?
public class Q23
{
    public static void main(String[] args)
    {
		if(args.length < 1)
		{
			System.out.println("pls supply 1 cla");
		}
        String s1 = args[0];
		permutate(s1, 0, s1.length() - 1);
    } 
    private static void permutate(String str, int start, int end)
    {
        if (start == end)
		{
            System.out.println(str);
		}
        else
        {
            for (int i = start; i <= end; i++)
            {
                permutate(swap(str, start, i), start + 1, end);
            }
        }
    } 
    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    } 
}
 
/*
for abcd
--------
abcd
abdc
acbd
acdb
adcb
adbc
bacd
badc
bcad
bcda
bdca
bdac
cbad
cbda
cabd
cadb
cdab
cdba
dbca
dbac
dcba
dcab
dacb
dabc



permutate(abcd, 0, 3)
---------------------
	permutate(abcd, 1, 3)
	---------------------
		permutate(abcd, 2, 3)
		---------------------
			permutate(abcd, 3, 3)
			permutate(abdc, 3, 3)

		permutate(acbd, 2, 3)
		---------------------
			permutate(acbd, 3, 3)
			permutate(acdb, 3, 3)

		permutate(adcb, 2, 3)
		---------------------
			permutate(adcb, 3, 3)
			permutate(adbc, 3, 3)

	permutate(bacd, 1, 3)
	---------------------
		permutate(bacd, 2, 3)
		---------------------
			permutate(bacd, 3, 3)
			permutate(badc, 3, 3)
		permutate(bcad, 2, 3)
		---------------------
			permutate(bcad, 3, 3)
			permutate(bcda, 3, 3)
		permutate(bdca, 2, 3)
		---------------------
			permutate(bdca, 3, 3)
			permutate(bdac, 3, 3)

	permutate(cbad, 1, 3)
	---------------------
		permutate(cbad, 2, 3)
		---------------------
			permutate(cbad, 3, 3)
			permutate(cbda, 3, 3)

		permutate(cabd, 2, 3)
		---------------------
			permutate(cabd, 3, 3)
			permutate(cabd, 3, 3)

		permutate(cdab, 2, 3)
		---------------------
			permutate(cdab, 3, 3)
			permutate(caba, 3, 3)

	permutate(dbca, 1, 3)
	---------------------
		permutate(dbca, 2, 3)
		---------------------
			permutate(dbca, 3, 3)
			permutate(dbac, 3, 3)

		permutate(dcba, 2, 3)
		---------------------
			permutate(dcba, 3, 3)
			permutate(dcab, 3, 3)

		permutate(dacb, 2, 3)
		---------------------
			permutate(dacb, 3, 3)
			permutate(dabc, 3, 3)

*/