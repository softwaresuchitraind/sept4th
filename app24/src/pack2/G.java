package pack2;
class G extends pack1.A 
{
	public static void main(String[] args) 
	{
		G g1= new G();
		System.out.println(g1.i);
	}
}
/*
default scoped i is not availabe in G class.
*/