import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
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
@B(message="abc")

class C
{
}
class M15 extends C
{
	public static void main(String args[])throws Exception
	{
		Class c1 = Class.forName("M15");
		Annotation[] annotations = c1.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}

/*
@A(message=abc)

-Only A annotations are inherited.
-There is only one metaannotation inherited.


3 Annotations
@Target
@Retention
@Inherited



*/