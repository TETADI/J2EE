interface Maddy
{
	void maty();
	static void mass()

	{
		System.out.println("This is Maddy from static void");
	}

}
public class StaticInterface 
{

	public static void main(String[] args)
	{
		Maddy.mass();//You can directly call the method with class name when there is static in Interface 

	}

}
  