class Iphone//class 
{
	int call;
	int msge;
	int phone;
	
	
	public void Use()
	{
		phone=call+msge;
	
	}
}


public class ObjectsLearning 
{

	public static void main(String[] args) 
	{
		Iphone obj = new Iphone();
		obj.call=5;
		obj.msge=10;
		obj.Use();
		System.out.println("The Answer is:" + obj.phone );

	}

}
