//Method Overriding 
class AB
{
	public void show()
	{
		System.out.println("Hi");
	}
}

class BC extends AB //Method OverRiding 
{
	public void show()
	{
		super.show(); //If you append super.show, It will apply and showcase the output of method in super cLASS ALSOI 
		    
		System.out.println("HELLO");
	}
}
public class MethodOverriding
{
	public static void main(String[]args)
	{
		BC obj = new BC();
		obj.show();
	}
}


























