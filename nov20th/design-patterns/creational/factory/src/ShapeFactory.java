public class ShapeFactory 
{
	public static Shape getShape(String shapeType) 
	{
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if(ShapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		else if(ShapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		return null;
		System.out.println("Hello World!");
	}
}
