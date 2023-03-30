//Merge sort
class E 
{
	private static int[] array;
	private static int[]tempMergArr;
	private static int length;
	public static void main(String[] args) 
	{
		int [] inputArr={45,23,11,89,77,98,4,28,65,43};
		sort(inputArr);
		for(int i:inputArr)
		{
			System.out.print(i+" ");
		}
	}
	public static void sort(int inputArr[])

	{
		array=inputArr;
		length=inputArr.length;
		tempMergArr= new int[length];
		doMergeSort(0,length-1);//0,9

	}

	public static void doMergeSort(int lowerIndex, int higherIndex)

	{
		if(lowerIndex<higherIndex)
		{
			int middle = lowerIndex+
				(higherIndex-lowerIndex)/2;
			//Below step sorts the left side of the array
			doMergeSort(lowerIndex,middle);//1
			//Below steps sort the right side of the array
			doMergeSort(middle+1,higherIndex);//2
			//Now merge both the sides
			mergeParts(lowerIndex,middle,higherIndex);//3
	}

}
//mergeParts(0,0,1)//7--(0,2,1)
public static void mergeParts(int lowerIndex,int middle, int higherIndex)
	{
	for(int i=lowerIndex;
				i<=higherIndex;i++)
		{
			tempMergArr[i]=array[i];		
	    }
	int i=lowerIndex;
	int j=middle+1;
	int k=lowerIndex;
	while(i<=middle && j<=higherIndex)
		{
		if(tempMergArr[i]<=tempMergArr[j])
			{
				array[k]=tempMergArr[i];
				i++;
			}
		else
			{
				array[k]=tempMergArr[j];
				j++;
		    }
			k++;
		}
	while(i<=middle)
		{
			array[k]=tempMergArr[i];
			k++;
			i++;
		}

	}

}