import java.lang.annotation.Repeatable;

//container
@interface AllAuthors
{
	Author[] value(); //method name should be value
}

@Repeatable(value = AllAuthors.class)	//JDK1.8
@interface Author
{
	String name();
}

@Author(name="Pavan")
@Author(name="Naresh")
@Author(name="Naveen")
public class G 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
-in order to reperate same anotation again again.
by default we can not repeate same annotation.
-repeted not allowed by default.
-for that purpose we have to go for container annotation.

*/
