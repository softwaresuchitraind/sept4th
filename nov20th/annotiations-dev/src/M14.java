import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@interface A
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
@interface B
{
	String message();
}

@A(message="abc")
@B(message="xyz")
class M14
{
	public static void main(String args[])throws Exception
	{
		Class c1 = Class.forName("M14");
		Annotation[] annotations = c1.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}

/*

@B(message=xyz)
-There are two annotations

-Through reflection API --while loading M14 class that complete
information available

-While running whichever Annotations available in the memory
tat we get

only B as retention policy is runtime.

class available in class file only.

A and B both are available in class file.
while loading only B information available


*/