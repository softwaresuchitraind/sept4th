import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)
@interface D
{
	String message();
}


/*
-we are fixing the annotations use only to methods.
this annotation can not be used for fields,classes and packages.

-There are several ElementType is available.
-Target is a meta annotation-
-is used for describing another description.

*/