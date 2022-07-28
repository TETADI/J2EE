interface Pru
{
	void show();
	/*void she()
	{
		System.out.println("Default will work in Interface method");
	}*/
	default void she()
	{
		System.out.println("Default will work in Interface method");	
	}
}

class Pro implements Pru
{
	
	public void show()
	{
		System.out.println("Know I understood");
	}
public void he()
{
	System.out.println("I am TTR");
}
}


public class DefaultInterfaceMethod 
{

	public static void main(String[] args)
	{
		Pru	p = new Pro();
		p.show();
		p.she();
		p.she();

	}

}
