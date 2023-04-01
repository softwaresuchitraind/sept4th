import java.util.Scanner;
public class MealBuilder  
{
	public static void main(String[] args) 
	{
		Meal meal = new Meal();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Available items:");
			System.out.println("Veg Burger");
			System.out.println("Chicken Burger");
			System.out.println("Pespi");
			System.out.println("Coke");
			System.out.println("==============");
			System.out.println("Enter 1 for Veg Burger");
			System.out.println("Enter 2 for Chicken Burger");
			System.out.println("Enter 3 for Pepsi");
			System.out.println("Enter 4 for Coke");
			int i = sc.nextInt();
			if(i == 1)
			{
				meal.addItem(new VegBurger());
			}
			else if (i == 2)
			{
				meal.addItem(new ChickenBurger());
			}
			else if(i == 3)
			{
				meal.addItem(new Pepsi());
			}
			else if(i == 4)
			{
				meal.addItem(new Coke());
			}
			else
			{
				System.out.println("invalid option");
			}
			System.out.println("Do you want one more item? (y/n)");
		}
		while ("y".equals(sc.next()));
		meal.showItems();
		System.out.println(meal.getCost());
		System.out.println("Thankq. visit again");
	}
}
