class Iphone
{
	private int cost;
	
	public Iphone()
	{
		cost=256;
	}
	
	public Iphone(int n)
	{
		cost=n;
	}
	
	public void display()
	{
		System.out.println("The number is:" + cost);
	}
	
	
}
public class ConstructorOverloading
{

	
	public static void main(String[] args)
	{
		Iphone obj1 = new Iphone();
		Iphone obj2 = new Iphone(25);
		
		obj1.display();
		obj2.display();
	}

}
