import java.lang.annotation.Documented;

@Documented
@interface D
{

}

@interface D1
{

}

@D
@D1

public class E 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}


/*
D annotation described with Documented Meta annotation. D1 doen not have

We can develop java.documentation.


*/