class Job
{
	String title;
	double salary;
	Job(String title, double salary)
	{
		this.title = title;
		this.salary = salary;
	}
}
class Employee
{
	String name;
	Job[] jobs;
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	Iterator getIterator()
	{
		Iterator it = new Iterator(jobs);
		return it;
	}
static class Iterator
{
	private Job[] jobs;
	private  static int index;
	Iterator(Job[] jobs)
	{
		this.jobs = jobs;
	}
	boolean hasNext()
	{
		return index < jobs.length;
	}
	Job nextJob()
	{
		return jobs[index ++];
	}
}//end of Iterator
}// end Employee

class  M6
{

	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 25000);
		Job j3 = new Job("hr", 15000);
		Job[] jobs = {j1,j2,j3};
		Employee e1 = new Employee("vijay", jobs);
		Job job;
		Employee.Iterator obj = e1.getIterator();
		while(obj.hasNext())
		{
			job = obj.nextJob();
			System.out.println(job.title+ ":" +job.salary);
		}

		System.out.println("-------------");
		obj = e1.getIterator();
		while(obj.hasNext())
		{
			job = obj.nextJob();
			System.out.println(job.title + ":" +job.salary);
		}
		System.out.println("-------------------");
	}
}

/*
->in order to make any inner class member as static inner class itself 
should be declared as static.


What is the need of inner class ?

software:50000.0
hardware:25000.0
hr:15000.0
-------------
-------------------


-If we want to develop any static members inside inner class then 
inner class itself should be static.


0111111
1011111
1101111
1110111
1111011
1111101
1111110

*/
