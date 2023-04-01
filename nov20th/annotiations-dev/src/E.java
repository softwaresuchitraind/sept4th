import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface E
{
	String message();
}

/*
Retention also meta-annotation like a target

RetentionPolicy --
There are three retention policy is available

-source--whwereever annotation goes only java file
-CLASS--compiler trasfering E annotations to class file
-Runtime---E description will be loaded while loading into memory



-it should be retain in java file or class file or trasfered to Runtime.

*/