interface  Teja
{
	
	int a=3;

	void show();
	 void fancy();
	
}

 class Sai
{
	public void leg()
	{
		
	}
	public void stretch()
	{
		System.out.println("It's going to be alright son");
	}
}

abstract class Harsha extends Sai implements Teja
{
	
	public abstract void fancy();
	
}
public class LearnInterface 
{

	public static void main(String[] args) 
	{
	Sai obj = new Sai();
	//obj.show();
	obj.stretch();
	
	//.out.println(obj.d);
	

	}

}
