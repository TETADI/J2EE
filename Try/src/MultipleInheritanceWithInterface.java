interface Pal
{
	 void bob();
	default void wonker()
	{
		System.out.println("You are a prick");
	}
}
interface Bal
{
	default void wonker()
	{
		System.out.println("You are the prick");
	}
}
class C implements Pal, Bal
{
	public void bob()
	{
		System.out.println("bob is great");
	}
	public void twat()
	{
		System.out.println("It's a british swear word");
	}
	public void wonker()
	{
		//System.out.println("You are a proper prick");
		
		Bal.super.wonker();
	}
}
public class MultipleInheritanceWithInterface
{

	public static void main(String[] args) 
	{
		C obj = new C();
		obj.bob();
		obj.twat();
		obj.wonker();
		
		
		
		

	}

}
