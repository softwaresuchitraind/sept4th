import java.io.*;
class Person implements Serializable 
{
	static String name;
	int age;
	double weight;
	Person(String name,int age,double weight)
	{
		this.name= name;
		this.age=age;
		this.weight = weight;
	}
}
