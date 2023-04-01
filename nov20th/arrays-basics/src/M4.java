class M4
{
	public static void main(String[] args) 
	{
		double [] elements = new double[3];
		System.out.println("@step1 :"+elements[0]+", "+ elements[1]+ ", "+elements[2]);
		elements[0]	= 1.0;
		elements[1] = 20.5;
		elements[2]	= 3.70;
		System.out.println("@step2 :"+elements[0]+", "+ elements[1]+ ", "+elements[2]);
	}
}

//default values are depending on datatype