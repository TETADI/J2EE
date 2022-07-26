class A// Super Class
{
	public A()
	{
		//int i;
		System.out.println("in A");
	}
	
	public A(int i)
	{
		System.out.println("in A init");
	}
}

class B extends A// Sub Class
{
	public B()
	{
		//int j;
		System.out.println("in B");
	}
	
	public B(int i)
	{
		super(i);
		System.out.println("in B init");
	}
}
public class SuperClass
{

	public static void main(String[] args) 
	{
		
      B obj1 = new B(6);
      
      
      
     
      
	}

}

