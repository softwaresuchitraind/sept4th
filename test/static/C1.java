class C1
{
    static void test()
    {
        System.out.println("from C test()");
    }
}
public class E1 
{
    public static void main(String[] args) 
    {
        System.out.println("from E1 main");    
        C1.test();
    }
}