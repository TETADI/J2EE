abstract class Test
{
	public abstract void hi();
	//{
		//System.out.println("The print was Hi");
	//}
	
	public void hello()
	{
		System.out.println("The print was Hello");
	}
	
}

class Test2 extends Test
{
	public void hi()
	{
		System.out.println("The print was Hi");
	}
	
	public void declare(Number i)
	{
		System.out.println(i);
	}
}


public class AbstractClassDemo
{

	public static void main(String[] args) 
	{
		 Test2 obj = new Test2();
		 obj.hello();
		 obj.hi();
		 obj.declare(25);
		 obj.declare(25.5);
		 

	}

}
